package com.school.portal.service;

import java.util.Map;

public class QueryCondition {
	private Integer page;
	private Integer rows;
	private String sort;
	private String order;
	private Map<String,Object> otherParams;
	
	public QueryCondition() {}

	public QueryCondition(Integer page, Integer rows, String sort,
			String order, Map<String, Object> otherParams) {
		super();
		this.page = page;
		this.rows = rows;
		this.sort = sort;
		this.order = order;
		this.otherParams = otherParams;
	}
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Map<String, Object> getOtherParams() {
		return otherParams;
	}

	public void setOtherParams(Map<String, Object> otherParams) {
		this.otherParams = otherParams;
	}
	
	
	
	

}
