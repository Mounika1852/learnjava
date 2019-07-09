package com.mounika.oops;

public class Constructors {
	private String message = "Hi! ";
	
	public Constructors() {
		
		System.out.println(message);
	}
	public Constructors(String input) {

		System.out.println(message + input);
	}
	
	public Constructors(int value , String string, String input) {
		System.out.println("Multiple parameters");
	}

	public static void main(String args[])
	{
		Constructors defaultconstructor = new Constructors();
		Constructors singleparameter = new Constructors("Default parameter");
		Constructors multipleparameter = new Constructors(0, "second parameter", "Third Parameter");
	}

}


