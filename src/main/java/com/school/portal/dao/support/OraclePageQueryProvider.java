package com.school.portal.dao.support;

public class OraclePageQueryProvider implements PageQueryProvider {

	@Override
	public String getPageableQuery(String sql, int start, int count) {
		StringBuffer sqlSb = new StringBuffer();
	    sqlSb.append("select * from ");
	    sqlSb.append(" (select t.*,rownum rn from (");
	    sqlSb.append(sql);
	    sqlSb.append(" ) t ");
	    sqlSb.append(" where rownum <").append(" " + count + ")");
	    sqlSb.append(" where rn > " + start);
		return sqlSb.toString();
	}
}
