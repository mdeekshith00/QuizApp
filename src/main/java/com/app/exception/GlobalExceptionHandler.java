package com.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(QuestionNotFound.class)
	public ResponseEntity<ErrorResponse> handleQuestionNotFoundException(QuestionNotFound qe) {
		ErrorResponse error = new ErrorResponse("Question","qid",qe.getMessage());
		return new ResponseEntity<>(error , HttpStatus.NOT_FOUND);
	}
		
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleGenericException(Exception qe) {
		ErrorResponse error = new ErrorResponse("Question","qid",qe.getMessage());
		return new ResponseEntity<>(error , HttpStatus.NOT_FOUND);
	}

}
