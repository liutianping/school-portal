package com.school.portal.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.school.portal.entity.system.Resource;

@Repository
public interface ResourceMapper extends BasicMapper<Resource, Long> {
	
	public List<Long> findAllParentId();

}
