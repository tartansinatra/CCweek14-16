package com.codeclan.md;

import java.util.ArrayList;
import java.util.Date;


/**
 * I am a Car Park!
 *
 */
public class Carpark 
{
	
	private ArrayList<Vehicle> parkedVehicles;
	
	protected int spaces;
	protected double pricePerHour;
	protected Date openFrom;
	protected Date openTo;
	
	public Carpark() {
		parkedVehicles = new ArrayList<>();
	}
	
	public Carpark(int spaces, double pricePerHour, Date openFrom, Date openTo) {
		this();
		this.spaces = spaces;
		this.pricePerHour = pricePerHour;
		this.openFrom = openFrom;
		this.openTo = openTo;
		
	}
	
	public void enter(Vehicle v){
		parkedVehicles.add(v);
	}

	public ArrayList<Vehicle> getParkedVehicles() {
		return parkedVehicles;
	}

	public void setParkedVehicles(ArrayList<Vehicle> parkedVehicles) {
		this.parkedVehicles = parkedVehicles;
	}
}
