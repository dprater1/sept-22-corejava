package com.cognixia.jump.collectionsgenerics;

public class Calculator {

//	public static<N extends Number> N sum(N input1, N input2) {
//		return input1 + input2;
//	}
//	
	
	
	public static <N extends Number> Double sum(N input1, N input2){
		
		return input1.doubleValue() + input2.doubleValue();
	
	}
	// varArgs must be the last parameter
	public static <N extends Number> Double sum(N...input) {
		double sum = 0;
		for(N num : input) {
			sum += num.doubleValue();
		}
		return sum;
	}
	//varArgs, variable amount of arguments
	
}
