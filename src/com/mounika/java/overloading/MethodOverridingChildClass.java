package com.mounika.java.overloading;

public class MethodOverridingChildClass extends MethodOverridingBaseClass{
	
	@Override
	public int add(int num1, int num2) {
		System.out.println("In method overriding child class");
		return num1+num2;
	}
	
	public static void main(String[] args) {
		MethodOverridingBaseClass methodOverridingBaseClass = new MethodOverridingBaseClass();
		methodOverridingBaseClass.add(5, 12);
		
		MethodOverridingChildClass methodOverridingChildClass = new MethodOverridingChildClass();
		methodOverridingChildClass.add(6, 13);
		
		//Over riding the behavior of parent -- 1st
		methodOverridingBaseClass = methodOverridingChildClass;
		methodOverridingBaseClass.add(2, 4);
		
		}

}
