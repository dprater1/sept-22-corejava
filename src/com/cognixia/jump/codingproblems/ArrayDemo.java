package com.cognixia.jump.codingproblems;

public class ArrayDemo {

	public boolean checkArray(int arr[], int arr2[]) {
		boolean flag = false;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				
				if(arr[i] == arr[j]) {
					flag = true;
					continue;
				}
				else {
					flag = false;
				}
			}
		}
		return flag;
	}
}
