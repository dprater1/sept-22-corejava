package com.cognixia.jump.classandobjects;

public class Vehicle {
	
	private String classType;
	private double numAxles;
	// This is composition, having an object inside of a class
	private Engine engine;
	
	public Vehicle() {
		this.classType = "C";
		this.numAxles = 2;
		this.engine = new Engine();
	}
	
	public String getClassType() {
		return this.classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}

	public double getNumAxles() {
		return numAxles;
	}

	public void setNumAxles(double numAxles) {
		this.numAxles = numAxles;
	}

	public Engine getEngine() {
		Engine input;
		if(engine == null) {
			input = new Engine();
		}
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [classType=" + classType + ", numAxles=" + numAxles + ", engine=" + engine + "]";
	}
	
	
	
	
	
}
