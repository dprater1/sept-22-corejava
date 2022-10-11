package com.cognixia.jump.javabasics;

import java.util.Scanner;

public class FlowControl {
	
	public static void main(String[] args) {
		
		//Conditionals:
		//If
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int readInt = input.nextInt();
		
		
//		switch (readInt) {
//		case 1:
//			System.out.println("You are withdrawing money.");
//			break;
//		case 2:
//			System.out.println("You are deposting money.");
//			break;
//		case 3:
//			System.out.println("Your balance is: " + 1_000_000);
//		}
		
		// The same above logic, but with if statements
		if(readInt == 1) {
			System.out.println("You are withdrawing money.");
		}
		else if(readInt == 2) {
			System.out.println("You are deposting money.");
		}
		else {
			System.out.println("Your balance is: " + 1_000_000);
		}
		
		int counter = 0;
		while(counter < 11) {
			System.out.println(counter);
			counter++;
		}
		// a local variable that defines a starting point, an ending condition of the loop
		// and how we traverse ther loop
		counter = 0;
		for(int i = 0; i < 10; i++) {
			counter++;
			System.out.println("For Loop: \""+counter + "\"");
		}
	}
}
