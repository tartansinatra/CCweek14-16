package com.codeclan.md;

public class Bicycle extends Vehicle {

	public Bicycle() {
		this(new Bell());
		maxOccupancy = 1;
		numberOfWheels = 2;
	}
	
	public Bicycle(Ringable ringer) {
		super(ringer);
	}
		
	
}
