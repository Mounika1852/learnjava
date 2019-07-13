package com.mounika.java.exceptions;

public class CustomUncheckedException extends RuntimeException {
	
private String errorMessage;

public CustomUncheckedException(String error) {
	super(error);
	this.errorMessage = error;
}

}
