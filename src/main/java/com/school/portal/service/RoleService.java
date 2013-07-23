package com.school.portal.service;

import org.springframework.transaction.annotation.Transactional;

import com.school.portal.dao.support.Page;

@Transactional
public interface RoleService extends BaseService{
	
	public void initRole();
	
	public Page queryRolePage(QueryCondition qc);
}
