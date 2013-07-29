package com.school.portal.web.dto;


public class ResourceDto {
	/**资源code**/
	private String code;
	/**资源名称**/
	private String resourceName;
	/**资源url**/
	private String resourceUrl;
	/**顺序**/
	private Integer ordered;
	/**状态**/
	private Integer status;
	/**资源类型**/   
	private Integer resoucreType; 
	/**上级菜单id **/
	private Long parentId;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public Integer getOrdered() {
		return ordered;
	}
	public void setOrdered(Integer ordered) {
		this.ordered = ordered;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getResoucreType() {
		return resoucreType;
	}
	public void setResoucreType(Integer resoucreType) {
		this.resoucreType = resoucreType;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	
	

}
