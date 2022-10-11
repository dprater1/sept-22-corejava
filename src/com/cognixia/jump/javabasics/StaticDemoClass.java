package com.cognixia.jump.javabasics;

// This class will be used to showcase static and instance features of a class to then be
// loaded in the static driver, and we can see priority in terms of memory ordering and execution.


public class StaticDemoClass {

	public StaticDemoClass() {
		System.out.println("This is the constructor.");
		
	}
	// Anonymous Code Block - instance Level (when an object is created)
	{
		System.out.println("This is the anonymous code block");
	}
	
	// Static Code Block - class level (whenever the class is accessed and loaded into memory and only once)
	static {
		System.out.println("This is the static code block.");
	}
	
	// Static Method - Class Level
	public static void staticMethod() {
		System.out.println("This is the static method.");
	}
	
	//Instance Method - Instance Level
	public void instanceMethod() {
		System.out.println("This is the instance method");
	}
}
