package com.app.model;

public class Response {
	private Integer id;
	private String responses;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(Integer id, String responses) {
		super();
		this.id = id;
		this.responses = responses;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getResponses() {
		return responses;
	}
	public void setResponses(String responses) {
		this.responses = responses;
	}
	@Override
	public String toString() {
		return "Response [id=" + id + ", responses=" + responses + "]";
	}
	
	

}
