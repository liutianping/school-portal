package com.school.portal.service;



import org.springframework.transaction.annotation.Transactional;

import com.school.portal.dao.support.Page;
import com.school.portal.web.dto.UserDto;



@Transactional
public interface UserService extends BaseService{
	
	public void loadUserData();
	
	public Page queryUserPage(QueryCondition qc);
	
	public void saveUser(UserDto userDto);
	
}
