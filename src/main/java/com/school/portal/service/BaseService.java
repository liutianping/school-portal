package com.school.portal.service;

import com.school.portal.dao.support.Page;

public interface BaseService {
	
	public Page queryPage(QueryCondition qc);

}
