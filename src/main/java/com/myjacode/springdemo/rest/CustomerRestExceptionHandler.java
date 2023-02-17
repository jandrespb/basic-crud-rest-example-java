package com.myjacode.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	/*
	 * @ExceptionHandler ---- method exception handler
	 * ResponseEntity<CustomerErrorResponse> ------- type response body
	 * CustomerNotFoundException ------ Exception type to handle / catch
	 * 
	 * 
	 * ResponseEntity<>(error, HttpStatus.NOT_FOUND) -------- <>(body, Status Code)
	 * */
	
	
	// Add an exception handler for CustomerNotFoundException (Our Exception)
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException exc){
		
		// create CustomerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				exc.getMessage(),
				System.currentTimeMillis());
		
		// return ResponseEntity
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	
	// Add another exception handler ... to catch any exception (catch all)
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(Exception exc){
		
		// create CustomerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse(
				HttpStatus.BAD_REQUEST.value(),
				exc.getMessage(),
				System.currentTimeMillis());
		
		// return ResponseEntity
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
}
