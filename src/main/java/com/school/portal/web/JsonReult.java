package com.school.portal.web;

public class JsonReult {
	private int status;
	private Object data;
	
	public JsonReult() {}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	
	public static JsonReult getJsonResult() {
		return new JsonReult();
	}
}
