package com.school.portal.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.school.portal.dao.BasicMapper;
import com.school.portal.dao.RoleMapper;
import com.school.portal.dao.support.Page;
import com.school.portal.entity.system.Role;
import com.school.portal.entity.system.User;
import com.school.portal.service.BaseServiceImpl;
import com.school.portal.service.QueryCondition;
import com.school.portal.service.RoleService;

@Component
public class RoleServiceImpl extends BaseServiceImpl implements RoleService{
	
	@Autowired
	private RoleMapper roleMapper;
	
	public void initRole() {
		Role role1 = new Role();
		role1.setCode("common");
		role1.setCreateTime(new Date());
		role1.setRoleName("普通用户");
		role1.setUpdateTime(new Date());
		
		Role role2 = new Role();
		role2.setCode("administrator");
		role2.setCreateTime(new Date());
		role2.setRoleName("管理员");
		role2.setUpdateTime(new Date());
		
		Role role3 = new Role();
		role3.setCode("super-administrator");
		role3.setCreateTime(new Date());
		role3.setRoleName("超级管理员");
		role3.setUpdateTime(new Date());
		
		roleMapper.save(role1);
		roleMapper.save(role2);
		roleMapper.save(role3);
	}
	
	public Page queryRolePage(QueryCondition qc) {
		int total = roleMapper.getTotal(qc.getOtherParams());
		List<Role> roleList = roleMapper.findByPage(Page.getPageNo(qc.getPage(), qc.getRows()), qc.getRows(),qc.getSort(),qc.getOrder(),qc.getOtherParams());
		Page pager = new Page();
		pager.setItems(roleList);
		pager.setTotalRecord(total);
		return pager;
	}

	@Override
	public BasicMapper<?, Long> getBasicMapper() {
		return roleMapper;
	}
	


}
