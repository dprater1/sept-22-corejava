package com.cognixia.jump.classandobjects;

import java.io.Serializable;

public class Horse extends Animal implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7136824088599524069L;

	public Horse(){
		super();
	}
	
	public Horse(String type, double weight){
		this.type = type;
		this.weight = weight;
	}
	
	public void makeSound(String sound){
		System.out.println("Horse makes " + sound);
	}
}
