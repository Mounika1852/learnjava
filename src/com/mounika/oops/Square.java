package com.mounika.oops;

public class Square extends Shape {

	@Override
	public double area(double length, double breath) {
		System.out.println("Calculating area for Square");
		return length*4;
	}

}
