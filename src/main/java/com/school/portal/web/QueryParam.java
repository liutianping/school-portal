package com.school.portal.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class QueryParam {
	private String column;
	private String condition;
	private Date createTime;
	private Date updateTime;
	private Map<String,Object> otherParam;
	
	public QueryParam() {}

	public QueryParam(String condition, String column, Date createTime,
			Date updateTime) {
		super();
		this.condition = condition;
		this.column = column;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public Map<String,Object> getParams() {
		Map<String,Object> param = new HashMap<String, Object>();
		if (column != null && !column.equals("")) 
			param.put(column, condition);
		
		if (createTime != null) 
			param.put("createTime", createTime);
		
		if (updateTime != null)
			param.put("updateTime", updateTime);
		
		if (otherParam != null && otherParam.size() > 0)
		      param.putAll(otherParam);	
		
		return param;
	}

	public void setOtherParam(Map<String, Object> otherParam) {
		this.otherParam = otherParam;
	}
	
}
