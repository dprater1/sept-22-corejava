package com.cognixia.jump.classandobjects;

import java.io.Serializable;

public class Animal implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// A basic class is known in java as a POJO
	// Plain Old Java Object or also a Bean(java bean).
	
	//Attributes
	public String type;
	public double weight;
	private static int count = 0;
	//Constructors
	public Animal() {
		this.type = "N/A";
		this.weight = 0.0;
		count++;
	}
	
	public Animal(String type, double weight) {
		this.type = type;
		this.weight = weight;
		count++;
	}
	
	//Methods
	void makeSound(String sound){
		Animal animal = new Animal();
		System.out.println("Animal makes " + sound);
	}
	
	@Override
	public String toString() {
		return "Animal [type=" + type + ", weight=" + weight + "]";
	}
	
	
}
