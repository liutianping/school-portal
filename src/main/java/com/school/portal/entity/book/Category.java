package com.school.portal.entity.book;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.school.portal.entity.BaseModel;

public class Category implements Serializable,BaseModel<Category>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7137640264546190874L;

	public Class<Category> getModelClass() {
		return Category.class;
	}
	
	private Long id;
	private String code;
	private String categoryName;
	private Integer status;
	private Date createTime;
	private Date updateTime;
	private Date version;
	private List<Category> categories = new ArrayList<Category>();
	private Category category;
	
	public Category() {}

	public Category(Long id, String code, String categoryName, Integer status,
			Date createTime, Date updateTime, Date version,
			List<Category> categories, Category category) {
		super();
		this.id = id;
		this.code = code;
		this.categoryName = categoryName;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.version = version;
		this.categories = categories;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	

}
