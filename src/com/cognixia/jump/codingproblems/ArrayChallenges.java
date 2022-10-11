package com.cognixia.jump.codingproblems;

public class ArrayChallenges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,2};
		int[] arr2 = {2,2,4,1};
		int[] arr3 = {1,2,3,4,5,6,7,8,9,11,12};

		
		System.out.println(challenge1(arr,arr2));
		System.out.println(challenge2(arrayGen(99)));
	}

	static boolean challenge1(int[] arr, int[] arr2) {
		if(arr.length != arr2.length) return false;
		
		boolean flag = false;
		for(int i = 0; i < arr.length; i++) {
			flag = false;
			for(int j = 0; j < arr2.length; j++) {
				if(arr[i] == arr2[j]) {
					flag = true;
				}
			}
			if(flag == false) {
				return false;
			}
		}
		return flag;
	}
	
	static int challenge2(int[] arr) {
		
		for(int i = 1; i < arr.length-1; i++) {
			if(arr[i-1] + 1 != arr[i]){
				return arr[i-1] + 1;
			}
		}
		return 0;
	}
	
	static int[] arrayGen(int length) {
		int[] arr = new int[length]; 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		return arr;
	}
}
	
	