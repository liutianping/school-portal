package com.school.portal.entity.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Transient;


import com.alibaba.fastjson.annotation.JSONField;
import com.school.portal.entity.BaseModel;

/**
 * 
 * @author Fe
 * 资源
 */
public class Resource implements BaseModel<Resource>,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1023132299223390716L;
	
	public static final Integer STATUS_ENABLE = 5;
	public static final Integer STATUS_DISABLE = 10;
	
	public static final Integer RESOURCES_TYPE_MUNE = 5;
	public static final Integer RESOURCES_TYPE_BUTTON = 10;

	@JSONField(serialize=false)
	public Class<Resource> getModelClass() {
		return Resource.class;
	}
	
	/**主键**/
	private Long resourceId;
	/**资源code**/
	private String code;
	/**资源名称**/
	private String resourceName;
	/**资源url**/
	private String resourceUrl;
	/**顺序**/
	private Integer ordered;
	/**状态**/
	private Integer status = STATUS_ENABLE;
	/**资源类型**/
	private Integer resoucreType;
	/**创建时间**/   
	private Date createTime;
	/**更新时间**/
	private Date updateTime;
	/**上级菜单id **/
	private Long parentId;
	
	public Resource(){}
  
	public Resource(Long resourceId, String code, String resourceName,
			String resourceUrl, Integer status, Integer resoucreType,
			Date createTime, Date updateTime) {
		super();
		this.resourceId = resourceId;
		this.code = code;
		this.resourceName = resourceName;
		this.resourceUrl = resourceUrl;
		this.status = status;
		this.resoucreType = resoucreType;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public Integer getOrdered() {
		return ordered;
	}

	public void setOrdered(Integer ordered) {
		this.ordered = ordered;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getResoucreType() {
		return resoucreType;
	}

	public void setResoucreType(Integer resoucreType) {
		this.resoucreType = resoucreType;
	}
	
	
	

}
