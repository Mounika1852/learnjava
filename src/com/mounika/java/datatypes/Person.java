package com.mounika.java.datatypes;

public class Person {
	
	private String firstname;
	private String lastname;
	private int age;
	private float height;
	
	public String getFirstname() {
		return firstname.toUpperCase();
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	

}
