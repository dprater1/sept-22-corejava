package com.cognixia.jump.classandobjects;

public class CompositionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car1 = new Vehicle();
		
		System.out.println(car1.getClassType());
		car1.setClassType("Sedan");
		System.out.println(car1.getClassType());
		
		System.out.println(car1);
		
	}
	

}
