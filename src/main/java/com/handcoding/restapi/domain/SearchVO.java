package com.handcoding.restapi.domain;

import io.swagger.annotations.ApiModelProperty;

/**
 * 검색 도메인
 * @author 이승환
 * @version 2018.01.13 v1.0
 */
public class SearchVO {
	
	@ApiModelProperty(value="페이징 시작값")
	private int offset;
	@ApiModelProperty(value="페이징 리스트 수")
	private int limit;
	
	@ApiModelProperty(value="검색범위")
	private String scope = "all";
	@ApiModelProperty(value="검색 키워드")
	private String keyword;
	@ApiModelProperty(value="정렬 쿼리")
	private String orderBy;
	
	public int getOffset() {
		return offset > 0 ? offset : 0;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getLimit() {
		return limit > 0 ? limit : 0;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	@Override
	public String toString() {
		return "SearchVO [offset=" + offset + ", limit=" + limit + ", scope=" + scope + ", keyword=" + keyword
				+ ", orderBy=" + orderBy + "]";
	}
}
