package com.cognixia.jump.javabasics;

import java.util.Scanner;

public class ReadFromConsole {
	//This demo will use a Java Standard Library data type, Scanner, to read user input
	// the keyboard
	// Note - Scanner is NOT a primitive data type, rather a Class/Object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This program takes in user input and will print it
		
		// step 1 - set up the user input with a Scanner
		
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to write?");
		String result = input.nextLine();
		System.out.println("You wrote: "+ result + ", right?");
		System.out.println("1 for yes, 0 for no");
		int num = input.nextInt();
		if(num == 1) {
			System.out.println("Great!");
		}
		else{
			System.out.println("That shouldn't happen...");
		}
	}

}
