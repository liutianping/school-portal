package com.school.portal.dao.support;

public interface PageQueryProvider {

	public abstract String getPageableQuery(String sql,int start,int count);
}
