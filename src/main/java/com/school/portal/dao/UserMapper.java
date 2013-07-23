package com.school.portal.dao;

import org.springframework.stereotype.Repository;

import com.school.portal.dao.BasicMapper;
import com.school.portal.entity.system.User;


@Repository  
public interface UserMapper extends BasicMapper<User, Long>{

}
