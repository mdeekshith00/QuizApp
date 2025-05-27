package com.app.exception;

public class QuestionNotFound  extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public QuestionNotFound(String message) {
		super(message);
	}

}
