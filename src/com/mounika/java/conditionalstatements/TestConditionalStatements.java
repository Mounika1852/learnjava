package com.mounika.java.conditionalstatements;

public class TestConditionalStatements {
	
	public static void main(String[] args)
	{
		if(complicatedExpression("Karthik") && complicatedExpression("Priya"))
		{
			System.out.println("Value is either Karthik or Priya");
		}
		else if(complicatedExpression("Harsha"))
		{
			System.out.println("Value is Harsha");
		}
		else
		{
			System.out.println("Unknown person");
		}
		
		if(complicatedExpressionwithint(0) == 0)
		{
			System.out.println("1 is not 0");
		}
		else
		{
			System.out.println("not equal");
		}
	}
public static boolean complicatedExpression(String input) 
{
	System.out.println("Checking for " +input);
	return input.equals("Mouni") || input.equals("Priya");		
}

public static int complicatedExpressionwithint(int input) 
{
	System.out.println("Checking for " +input);
	return input;
		
}


}
