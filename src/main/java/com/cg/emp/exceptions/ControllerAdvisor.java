package com.cg.emp.exceptions;


import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ResponseBody
@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
	
	  @ExceptionHandler(EmployeeException.class)
	    public ResponseEntity<ErrorDetails> handleException1(EmployeeException e,HttpServletRequest req) {
		   String msg=e.getMessage();
		   String uri=req.getRequestURI();
	        ErrorDetails details = new ErrorDetails( msg,LocalDateTime.now(),uri);
	        return new ResponseEntity<ErrorDetails>(details, HttpStatus.BAD_REQUEST);  
	    }	
	  @ExceptionHandler(Exception.class)
	  public ResponseEntity<ErrorDetails> handleException(Exception ex,HttpServletRequest req)
	  {
	  String message=ex.getMessage();
	  String uri= req.getRequestURI();

	  ErrorDetails obj = new ErrorDetails(message,LocalDateTime.now(),uri);
	  ResponseEntity<ErrorDetails> re = new ResponseEntity<ErrorDetails>(obj,HttpStatus.BAD_REQUEST);
	  return re;
	  }
	  
	}

