package com.cognixia.jump.classandobjects;

public class Engine {
	
	private double size;
	private String alignment;
	private int numCyclinders;
	private String manufacturer;
	
	public Engine() {
		this.size = 3.0;
		this.alignment = "inline";
		this.numCyclinders = 4;
		this.manufacturer = "Toyota";
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public int getNumCyclinders() {
		return numCyclinders;
	}

	public void setNumCyclinders(int numCyclinders) {
		this.numCyclinders = numCyclinders;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Engine [size=" + size + ", alignment=" + alignment + ", numCyclinders=" + numCyclinders
				+ ", manufacturer=" + manufacturer + "]";
	}
	
	
	
	
}
