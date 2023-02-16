package com.myjacode.springdemo.rest;

public class CustomerErrorResponse {
	
	

	private int status;
	private String message;
	private Long timeStamp;
	
	// Constructor without fields
	public CustomerErrorResponse() {
		
	}

	// Constructor with fields
	public CustomerErrorResponse(int status, String message, Long timeStamp) {
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	
	// methods Getter And Setters
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}
