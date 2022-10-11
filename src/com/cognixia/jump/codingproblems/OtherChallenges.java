package com.cognixia.jump.codingproblems;

public class OtherChallenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(2,3);
		System.out.println(palindrome("Repaper"));
		
	}

	public static void swap(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("New x: " + x + " and New y: " + y);
	}
	
	public static boolean palindrome(String word) {
		int j = word.length()-1;
		word = word.toLowerCase();
		for(int i = 0; i < word.length()/2; i++) {
			char c = word.charAt(i);
			char d = word.charAt(j);
			j--;
			if(c != d) {
				return false;
			}
		}
		return true;
	}
}
