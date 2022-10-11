package com.cognixia.jump.codingproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionChallenges {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> alist = new ArrayList<>();
		alist.add("Ashley");
		alist.add("Steve");
		alist.add("John");
		alist.add("Kyle");
		alist.add("Connor");
		int inside = 0;
		while(inside != 10) {
			System.out.println("Press 1 to input an index of a student"
					+ "\nPress 2 to look up a student"
					+ "\nPress 3 to add a student to the list"
					+ "\n10 to exit!");
			inside = sc.nextInt();
			switch(inside) {
			case 1:
				returnName(alist);
				break;
			case 2:
				lookUpName(alist);
				break;
			case 3:
				addName(alist);
				break;
			case 10:
				break;
			default:
				System.out.println("Input a valid number!");
				break;
			}
		}
		
		
	}
	public static void returnName(ArrayList<String> alist) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an index of a student between 0 and " + (alist.size()-1) + "!: ");
		boolean check = false;
		//While check is NOT true keep looping until check is turned true
		while(!check) {
		try {
		System.out.println(alist.get(sc.nextInt()) + "\n");
		check = true;
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Enter a correct number!");
			System.out.println("Enter an index of a student between 0 and 4!: ");
		}
		}
	}
	
	public static void lookUpName(ArrayList<String> alist) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to look up a specific name?");
		String s1 = "";
		//While the arraylist does NOT contain the name given keep looping until the arraylist does contain the name
		while(!alist.contains(s1)){
			s1 = sc.nextLine();
			try {
			System.out.println(alist.get(alist.indexOf(s1)) + " is in the list of students!\n");
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("That name does not exist!");
				System.out.println("Do you want to look up a specific name?");
			}
		}
	}
	
	public static void addName(ArrayList<String> alist) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What name would you like to add?");
		alist.add(sc.nextLine());
	}
	
	
}
