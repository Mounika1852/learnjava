package com.mounika.java.exceptions;

public class ExceptionHandling {

	public void throwCustomCheckedException() throws CustomCheckedException {
		
		throw new CustomCheckedException("Custom error message");
		
	}
	
	public void throwCustomUncheckedException() throws CustomUncheckedException{
	// throw new CustomUncheckedException("Unchecked Exception Message");
	}
	
	public static void main(String[] args) {
		
		ExceptionHandling exceptionHandling = new ExceptionHandling();
		
	
		
		try {
			exceptionHandling.throwCustomCheckedException();
		} catch (CustomCheckedException  | CustomUncheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		} finally {
			System.out.println("Inside finally ");
		}
		
		try {
		exceptionHandling.throwCustomUncheckedException();
		System.out.println("Checking");
		} catch (CustomUncheckedException e) {
			System.out.println(e.getMessage());
		}
		
			
		
		
		
	}
}
