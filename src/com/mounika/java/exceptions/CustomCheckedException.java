package com.mounika.java.exceptions;

public class CustomCheckedException extends Exception{
	
	private String errorMessage;
	
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public CustomCheckedException(String error) {
		super(error);
		this.errorMessage = error;
	
	}
	
	

}
