package com.school.portal.service;

import org.springframework.transaction.annotation.Transactional;

import com.school.portal.web.dto.ResourceDto;

@Transactional
public interface ResourcesService extends BaseService {
	
	public void initResources();
	
	public void saveResource(ResourceDto resourceDto);

}
