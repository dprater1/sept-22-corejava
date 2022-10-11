package com.cognixia.jump.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsDemoDriver {

	public static void main(String[] args) {
		int[] primitives = {2,4,6,8,10,12,14,16};
		
		// In need to convert the above array of ints to an array of objects
		Integer[] integers = new Integer[primitives.length];
		
		for(int i = 0; i < primitives.length; i++) {
			integers[i] = primitives[i];
		}
		
		//doing the above, but with streams. basically takes array of ints and makes it array of Integer objects
		//.boxed makes the items an object, .toArray makes it into an array of Integers
		Integer[] intObjs = Arrays.stream(primitives).boxed().toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(primitives));
		System.out.println(Arrays.toString(integers));
		System.out.println(Arrays.toString(intObjs));
		
		List<Integer> numbers = Arrays.asList(integers);
		
		System.out.println("\nFor Each example:");
		numbers.forEach(System.out::println);
		
		numbers.forEach(n -> System.out.println(n + "custom message!"));
		
		//use reduce to get the sum
		int sum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
		System.out.println(sum);
		
		int max = numbers.stream().reduce((num1, num2) -> num1 > num2 ? num1 : num2).get(); // ternary evaluation, which is not stream specific
		
		System.out.println();
		System.out.println(max);
		
		//Let's stream some custom objects
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("David",110_000,"Production"));
		employees.add(new Employee("LeBron",32_110_000,"Basketball"));
		employees.add(new Employee("Steve",150_000,"Research"));
		employees.add(new Employee("Harold",230_000,"Senior Analyst"));

		Employee lowest = employees.stream().reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2).get();
		
		System.out.println("Employee with lowest salary: " + lowest.toString());
		
		String searchValue = "david";
		Optional<Employee> search = employees.stream()
				.filter(e -> e.getName().equalsIgnoreCase(searchValue))
				.findFirst();
		
		if(search.isPresent()) {
			System.out.println(search.get());
		} else System.out.println(searchValue + " not found.");
		
		List<Integer> employeesAfterRaise = employees.stream()
				.map(e -> e.getSalary() *2 )
				.collect(Collectors.toList());
		System.out.println(employeesAfterRaise);
		employees.forEach(e -> e.setSalary(e.getSalary()*2));
		
		System.out.println(employees);
	}

	

}
