package com.school.portal.service.impl;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.school.portal.dao.BasicMapper;
import com.school.portal.dao.ResourceMapper;
import com.school.portal.entity.system.Resource;
import com.school.portal.service.BaseServiceImpl;
import com.school.portal.service.ResourcesService;
import com.school.portal.web.dto.ResourceDto;

@Component
public class ResourcesServiceImpl extends BaseServiceImpl implements ResourcesService {
	
	@Autowired
	private ResourceMapper resourceMapper;

	public void initResources() {
		Resource r1 = new Resource();
		r1.setCode("system");
		r1.setResourceName("系统管理");
		r1.setResoucreType(Resource.RESOURCES_TYPE_MUNE);
		r1.setCreateTime(new Date());
		r1.setUpdateTime(new Date());
		
		resourceMapper.save(r1);
	}
	
	public void saveResource(ResourceDto resourceDto) {
		Resource resource = new Resource();
		resource.setCode(resourceDto.getCode());
		resource.setCreateTime(new Date());
		resource.setOrdered(resourceDto.getOrdered());
		resource.setParentId(resourceDto.getParentId());
		resource.setResoucreType(resourceDto.getResoucreType());
		resource.setResourceName(resourceDto.getResourceName());
		resource.setResourceUrl(resourceDto.getResourceUrl());
		resource.setStatus(resourceDto.getStatus());
		resource.setUpdateTime(new Date());
		resourceMapper.save(resource);
	}

	@Override
	public BasicMapper<Resource, Long> getBasicMapper() {
		return resourceMapper;
	}
}
