package com.mounika.java.conditionalstatements;

import com.mounika.java.datatypes.Person;

public class TestSwitch {
	public static void main(String[] args)
	{
		Person p = new Person();
		p.setFirstname("Mounika");
		p.setAge(24);
		switch (p.getFirstname())
		{
		case("Priya") : printName("Priya");
		break;
		
		case("Mounika") : printName("Mounika");
		break;
		
		case("Suvan") : printName("Suvan");
		break;
		
		default : printName("Guest");
		}
	}
	public static void printName(String name)
	{
		System.out.println("Welcome " +name);
	}
	

}
