package com.mounika.java.abstractclass;

public class TestMounika {
	
	public static void main(String[] args) {
		ConcreteClass concreteClass = new ConcreteClass();
		MounikasAbstractClass abstractClass = new ConcreteClass();
		MounikaInterface interface1 = new ConcreteClass(); 
		
		//Anonymous class . 
		MounikaInterface inlineImplementation = new MounikaInterface() {
			
			@Override
			public void readbooks() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void playbadminton() {
				// TODO Auto-generated method stub
				
			}
		};
		
		//Anonymous class
		MounikasAbstractClass inlineAbstractClass = new MounikasAbstractClass() {
			//Another way of implementing 
			@Override
			public void cook() {
				// TODO Auto-generated method stub
				
			}
		};
	
	}

}
