package com.school.portal.dao.support;

import java.util.List;

public class Page {
	private int totalRecord;
	private List<?> items;
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public List<?> getItems() {
		return items;
	}
	public void setItems(List<?> items) {
		this.items = items;
	}
	
	public static int getPageNo(int page,int row) {
		return (page - 1) * row;
	}
}
