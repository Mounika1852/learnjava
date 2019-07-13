package com.mounika.java.wrapperclasses;

public class TestStrings {
	public static void main(String[] args) {
		String pattern1 = "First way";
		System.out.println(pattern1+" hashcode" + pattern1.hashCode());
		String pattern2 = new String("Second Pattern");
		System.out.println(pattern2 + " hashcode" + pattern2.hashCode() ) ;
		String pattern3 = new String(pattern1);
		System.out.println(pattern3+" hashcode" + pattern3.hashCode());
		
		System.out.println(pattern3.equals(pattern1));
	
		if(pattern1.equals(pattern3)) {
			System.out.println("Equal");	
		}
		
		StringBuffer buffer = new StringBuffer(pattern1);
		System.out.println(buffer.hashCode());
		buffer.append(pattern2);
		System.out.println(buffer.hashCode());
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder(pattern1);
		builder.append(pattern2);
		System.out.println(builder);
		
		
		}

}
