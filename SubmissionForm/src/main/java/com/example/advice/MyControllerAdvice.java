package com.example.advice;

import java.util.NoSuchElementException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.exception.EmptyInputException;

@ControllerAdvice
public class MyControllerAdvice extends ResponseEntityExceptionHandler  {
	

	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<String> handleException(EmptyResultDataAccessException e)
	{
		return new ResponseEntity<String>("Given ID is not valid/found",HttpStatus.NOT_FOUND); 
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegal(IllegalArgumentException e)
	{
		return new ResponseEntity<String>("Given ID shouldn't be null",HttpStatus.NOT_FOUND); 
	}
	
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handNoSuchMethod(NoSuchElementException e)
	{
		return new ResponseEntity<String>("Given element is not present",HttpStatus.NOT_FOUND); 
	}
	
	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handEmptyInput(EmptyInputException e)
	{
		return new ResponseEntity<String>("Input fields is empty",HttpStatus.BAD_REQUEST); 
	}
	
	 @Override
	  public ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException
	  ex, HttpHeaders headers, HttpStatus status, WebRequest request) { 
		 // TODOAuto-generated method stub 
	  return new ResponseEntity<Object>("Please change the http method type",HttpStatus.NOT_FOUND); 
	  }
	 
	
}
