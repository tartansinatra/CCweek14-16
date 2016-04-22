package com.codeclan.sr;

public class Bicycle {

	private String colour;
	private int gear;
	private int numberOfGears;
	//private int speed;

	public Bicycle() {
		colour = "pink";
	}
	
	public Bicycle(String colour) {
		this.colour = colour;
	}
	
	public Bicycle(int gear, int numberOfGears) {
		this.gear = gear;
		this.numberOfGears = numberOfGears;
	}

	public Bicycle(String colour, int gear, int numberOfGears) {
		this(colour);
		this.gear = gear;
		this.numberOfGears = numberOfGears;
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getGear() {
		return gear;
	}

	private void setGear(int gear) {
		this.gear = gear;
	}

	public void changeGear(int newGear) {
		if (newGear > 0 && newGear <= numberOfGears) {
			setGear(newGear);
		}	
	}

	public void speedUp() throws MaxSpeedExceededException {
		if (this.gear < this.numberOfGears) {
			changeGear(this.gear+1);
		} else {
		throw new MaxSpeedExceededException();
		}
	}
	
	@Override
	public String toString() {
		return "Colour: "+colour+", Gear: "+gear+", Number of Gears: "+numberOfGears;
	}

}
