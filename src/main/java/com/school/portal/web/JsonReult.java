package com.school.portal.web;

public class JsonReult {
	
	public static final int DEFAULT_STATUS = 1000;
	
	public static final int STATUS_SUCCESS = DEFAULT_STATUS;
	
	private int status;
	private String message;
	private Object data;
	
	public JsonReult(int status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public JsonReult(int status, Object data) {
		super();
		this.status = status;
		this.data = data;
	}



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
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static JsonReult getJsonResult() {
		return new JsonReult();
	}
	
	public static JsonReult getJsonReult(int status, String message, Object data) {
		return new JsonReult(status, message, data);
	}
	
	public static JsonReult getJsonReult(int status, Object data) {
		return new JsonReult(status, data);
	}
}
