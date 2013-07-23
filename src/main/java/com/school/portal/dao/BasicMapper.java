package com.school.portal.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface BasicMapper<T,PK extends Serializable> {
	
	public abstract PK save(T t);
	
	public abstract T getByPrimaryKey(PK id);
	
	public abstract int updateByPrimaryKey(T t);
	
	public abstract void deleteByPrimaryKey(PK id);
	
	public abstract void deleteAllByPrimaryKey(List<PK> ids);
	
	public abstract List<T> findAll();
	
	public abstract int getTotal(@Param(value="paramMap")Map<String,Object> paramMap);
	
	public abstract List<T> findByPage(@Param(value="pageNo")int pageNo,@Param(value="pageSize")int pageSize,
			                           @Param(value="sort")String sort,@Param(value="order")String order,
			                           @Param(value="paramMap")Map<String,Object> paramMap);
	
	
}
