package com.cognixia.jump.collectionsgenerics;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionsGenericsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Calculator.sum(5, 3));
//		System.out.println(Calculator.sum(5.3, 3.2));
//		System.out.println(Calculator.sum(1,2.2,3,4,5));
	
		//For all collections,
			//CRUD
			// Create Data, Read Data, Update Data, Delete Data
			// Loop through collection
		
		//List
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		System.out.println(colors);
		colors.add(0, "yellow");
		System.out.println(colors);
		
		System.out.println(colors.get(2));
		
		// ArrayList vs LinkedList
		
		
		//using create and remove to update, not always a direct method
		colors.remove(2);
		colors.add(2, "orange");
		System.out.println(colors);
		//Set
		Set<Integer> ints = new HashSet<>();
		
		Set<String> setColors = new HashSet<>(colors);
		
		setColors.add("Maroon");
		
		String search = "Orange";
		String found = "";
		for (String string : setColors) {
			if(string.equalsIgnoreCase(search)) found = string;
		}
		System.out.println(found);
		
		Iterator<String> iterColor = setColors.iterator();
		System.out.println("\nIterator Example");
		while(iterColor.hasNext()) {
			System.out.println(iterColor.next());
		}
		
		setColors.remove("orange");
		System.out.println(setColors);
		//Queue
			//Polymorphism with Interfaces
		List<String> listColors = new LinkedList<>(setColors);
		LinkedList<String> llColors = new LinkedList<String>(listColors);
		Queue<String> qColors = new LinkedList<>(llColors);
		//Deque allows for reading from the back
		Deque<String> dqColors = new LinkedList<>(llColors);
		
		System.out.println("/nLinked List prints:");
		System.out.println(listColors.get(1));
		System.out.println(llColors.getLast());
		
		System.out.println(qColors.poll());
		System.out.println(qColors.poll());
		
		qColors.add("Purple");
		System.out.println(qColors);
		
		//Map
		Map<String, Double> coins = new HashMap<>();
		
		coins.put("Quarter", 0.25);
		coins.put("Dime", 0.10);
		coins.put("Nickel",0.05);
		coins.put("Penny", 0.01);
	
		System.out.println(coins);
		System.out.println(coins.get("Dime"));
		
		for(String key : coins.keySet()) {
			System.out.println(key);
		}
	
	
	}

	
}
