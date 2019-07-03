package com.mounika.oops;

//This is a class 
public class OopsConcepts {
	public Shape shape; //This is a field
	 
	//Constructor
	public OopsConcepts() {
		shape = new Square();
		System.out.println("Inside OOPs ");
	}
	
	public OopsConcepts(Shape input) {
		// TODO Auto-generated constructor stub
	}
	 
	//This is method
	public static void main (String args[]) {
		 Shape shape = new Square();
		 System.out.println(shape.area(5.5, 5.5)); 
			shape.color();
		  shape = new Rectangle();
		  System.out.println(shape.area(6, 4));
			shape.color();
		   shape = new Shape() {
			
			@Override
			public double area(double length, double breath) {
				System.out.println("Calculating area for inline Implementation");
				return length*breath;
			}
		};
		System.out.println(shape.area(8,6));
		shape.color();
		
		
	}
}



