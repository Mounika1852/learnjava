package com.mounika.java.datatypes;

public class TestDatatypes {
	
	public static void main(String[] args) {
		int randomint = 5;
		long randomlong = 900;
		char randomchar = 'M';
		float randomfloat = 4.46f;
		double randomdouble = 7.8;
		
		System.out.println("randomint="+randomint);
		System.out.println("randomlong="+randomlong);
		System.out.println("randomchar="+randomchar);
		System.out.println("randomfloat="+randomfloat);
		System.out.println("randomdouble="+randomdouble);
		
		Person mounika = new Person();
		mounika.setFirstname("Mounika");
		mounika.setLastname("Maddipatla");
		mounika.setAge(24);
		mounika.setHeight(5.3f);
		
		System.out.println(mounika.getFirstname());
		System.out.println(mounika.getLastname());
		System.out.println(mounika.getAge());
		System.out.println(mounika.getHeight());
	}

}
 