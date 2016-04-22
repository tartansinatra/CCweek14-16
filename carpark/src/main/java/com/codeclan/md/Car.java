package com.codeclan.md;

public class Car extends Vehicle {

	public Car(){
		this(new Horn());
		maxOccupancy = 5;
		numberOfWheels = 4;
	}
	
	private Car(Ringable ringer) {
		super(ringer);
	}
	
	public Car (String manufacturer, String model, String colour, String registration) {
		this();
		this.manufacturer = manufacturer;
		this.model = model;
		this.colour = colour;
		this.registration = registration;
	}
}
