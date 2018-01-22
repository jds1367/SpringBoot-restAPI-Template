package com.handcoding.restapi.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handcoding.restapi.domain.ResponseVO;
import com.handcoding.restapi.domain.in.InUserSignUpVO;
import com.handcoding.restapi.service.UserSignUpService;

import io.swagger.annotations.ApiOperation;

/**
 * 기본사용자 회원가입 API
 * @author 이승환
 * @version 2018.01.23 v1.1
 */
@RestController
@RequestMapping("/normal")
public class SignUpController {
	
	@Autowired
	private UserSignUpService userSignUpService;
	
	/**
	 * 기본사용자 회원가입
	 * @param inUserSignUpVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value="", notes = "기본사용자 회원가입")
	@PostMapping("/v1.0/users")
	public ResponseVO<Object> signUp(@RequestBody InUserSignUpVO inUserSignUpVO) throws Exception {
		ResponseVO<Object> responseVO = new ResponseVO<>();
		userSignUpService.userSignUpEmail(inUserSignUpVO);
		return responseVO;
	}
	
}
