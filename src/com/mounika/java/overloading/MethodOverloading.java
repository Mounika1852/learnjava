package com.mounika.java.overloading;

public class MethodOverloading {
	
	public final int add (final int num1,final int num2) {
		//num1 = 5;
		System.out.println("Adding integers");
		return num1+num2;
	}
	
	public double add(double num1,double num2) {
		System.out.println("Adding double numbers");
		return num1+num2;
	}
	
	public float add(float num1,float num2) {
		System.out.println("Adding Float numbers");
		return num1+num2;
	}
	
	public void MethodOverloading() {
		System.out.println("In method overloading");
	}
	
public static void main(String[] args) {
	MethodOverloading methodOverloading = new MethodOverloading();
	
	System.out.println(methodOverloading.add(6, 7));
	System.out.println( methodOverloading.add(6.8, 4.0));
	System.out.println(methodOverloading.add(5.6f, 8f)); 
	methodOverloading.MethodOverloading();
}
}
