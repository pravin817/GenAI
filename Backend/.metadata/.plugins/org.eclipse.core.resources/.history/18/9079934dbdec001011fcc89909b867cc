package com.ptech.todo.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	// Handle specific exception: ResourceNotFoundException
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleResouceNotFoundException(ResourceNotFoundException exception,
			WebRequest webRequest) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setTimeStamp(LocalDateTime.now());
		errorDetails.setMessage(exception.getMessage());
		errorDetails.setDetail(webRequest.getDescription(false));

		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
	}

	// Handle Global Exceptions (Generic errors)
    @ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleGlobalException(Exception exception, WebRequest webRequest) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setTimeStamp(LocalDateTime.now());
		errorDetails.setMessage("Internal Server Error");
		errorDetails.setDetail(webRequest.getDescription(false));

		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
