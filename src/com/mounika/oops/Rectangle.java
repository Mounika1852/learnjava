package com.mounika.oops;

public class Rectangle extends Shape {

	@Override
	public double area(double length, double breath) {
		System.out.println("Calculating area for Rectangle");
		return length*breath;
	}

}
