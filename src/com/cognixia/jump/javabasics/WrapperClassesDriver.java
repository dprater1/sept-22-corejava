package com.cognixia.jump.javabasics;

public class WrapperClassesDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//integer
		byte b = 1;
		Byte B = b; //autoboxing a primitive into its corresponding Wrapper class object
		Byte bytes = 4;
		Byte objByte = new Byte("4"); //deprecated using Wrapper constructors
		
		short s = 2;
		Short S = s;
		
		int i = 3; 
		Integer I = i;
		
		long l = 4;
		Long L = l;
		
		
		//decimal
		float f = 5.0f;
		Float J = f;
		double d = 6.0;
		Double D = d;
		
		
		//text
		char c = 'c';
		Character C = c;
		//logical
		boolean bool = true;
		Boolean Boolean = bool;
		
	}

}
