package com.cognixia.jump.javabasics;

public class StaticDemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Static Methods can be run right off a class no object needed
		StaticDemoClass.staticMethod();
		//creates the space in heap memory
		StaticDemoClass demo = new StaticDemoClass();
		demo.instanceMethod();
		
	}

}
