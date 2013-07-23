package com.school.portal.dao.support;

public class MySqlPageQueryProvider implements PageQueryProvider {

	@Override
	public String getPageableQuery(String sql, int start, int count) {
		StringBuffer sqlSb = new StringBuffer();
		sqlSb.append(sql);
		sqlSb.append(" limit ").append(start);
		sqlSb.append(",");
		sqlSb.append(count);
		return sqlSb.toString();
	}

}
