package com.codeclan.md;

/**
 * I am a vehicle!
 *
 */

public abstract class Vehicle {

	protected Ringable ringer;
	
	protected String manufacturer;
	protected String model;
	protected String colour;
	protected String registration;
	boolean hasEngine;
	protected int topSpeed;
	protected int numberOfWheels;
	protected int maxOccupancy;
	protected int emissions;
	protected int size;
	
	protected Vehicle(Ringable ringer) {
		int speed = 0;
		registration = "n/a";
		this.ringer = ringer;
	}
	
	protected void speedUp() {
		topSpeed += 10;
	}
	
	protected void slowDown() {
		topSpeed -= 10;
	}
	
	protected String giveWarning(){
		return ringer.makeSound();
	}

	protected String getRegistration() {
		return registration;
	}
	
	protected void setRegistration(String registration) {
		this.registration = registration;
	}
	
	protected String getManufacturer(){
		return manufacturer;
	}
	
	protected void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}
	
	protected String getModel(){
		return model;
	}
	
	protected void setModel(String model){
		this.model = model;
	}
	
	protected String getColour(){
		return colour;
	}
	
	protected void setColour(String colour){
		this.colour = colour;
	}
	
	protected int getnumberOfWheels(){
		return numberOfWheels;
	}
	
	protected void setnumberOfWheels(int numberOfWheels){
		this.numberOfWheels = numberOfWheels;
	}

	
}
