package com.cognixia.jump.classandobjects;

import com.cognixia.jump.javabasics.Unicorn;

public class AnimalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new keyword reserves space in RAM for object provided
		//Ex. of instantiation using constructor "Animal ani = new Animal()"
		Animal ani = new Animal();
		ani.makeSound("generic.");
		Horse horse = new Unicorn();
		
		horse.makeSound("nyeh!.");
		
		Unicorn unicorn1 = new Unicorn();
		unicorn1.makeSound("poggers");
	}

}
