package com.cognixia.jump.codingproblems;

public class StringChallenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("Drink"));
		System.out.println(reverse2("Drink"));
		System.out.println(reverse3("Drink and Water"));
	}

	
	static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		return sb.toString();
	}
	
	static String reverse2(String str) {
		String ans = "";
		for(int i = str.length()-1; i >= 0; i--) {
			ans += str.charAt(i);
		}
		return ans;
	}
	
	static String reverse3(String str) {
		int j = str.length()-1;
		String ans = "";
		int start = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				ans += reverse2(str.substring(start, i)) + " ";
				start = i+1;
			}
			else if(i == j) {
				ans += reverse2(str.substring(start, i+1)) + " ";
			}
		}
		return ans;
		
	}
}
