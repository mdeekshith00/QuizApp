package com.app.exception;

public class ErrorResponse {
	private String resourceName;
	private String feildName;
	private String message;
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorResponse(String resourceName, String feildName, String message) {
		super();
		this.resourceName = resourceName;
		this.feildName = feildName;
		this.message = message;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFeildName() {
		return feildName;
	}
	public void setFeildName(String feildName) {
		this.feildName = feildName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ErrorResponse [resourceName=" + resourceName + ", feildName=" + feildName + ", message=" + message
				+ "]";
	}
	
	

}
