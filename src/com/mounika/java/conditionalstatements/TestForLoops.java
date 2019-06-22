package com.mounika.java.conditionalstatements;

import java.util.Arrays;

public class TestForLoops {
	public static void main(String[] args)
	{
		int num[] = {5,6,7,8};
		/*
		for(int i=0 ; i<num.length; i++)
		{
			System.out.println("Accessing element at index "+i );
			System.out.println(num[i]);
		}
		System.out.println("Printing with another for loop");
		*/
		
		for(int count : num)
		{
			if(count%2 == 0)
			System.out.println(count);
		}
		
		System.out.println("Printing using streams");
		
		Arrays.stream(num).forEach(value -> System.out.println(value));
			
	}

}
