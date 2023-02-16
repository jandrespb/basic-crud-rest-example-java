package com.myjacode.springdemo.rest;

public class CustomerErrorResponse {
	
	private int status;
	private String message;
	private Long timeStamp;
	
	// Constructor
	public CustomerErrorResponse() {
		
	}

	public CustomerErrorResponse(int status, String message, Long timeStamp) {
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	
	

}
