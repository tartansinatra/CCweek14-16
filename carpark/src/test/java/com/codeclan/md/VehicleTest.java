package com.codeclan.md;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class VehicleTest 

{
	public void testCar(){
		Car c = new Car(new Bell());
		System.out.println(c.giveWarning());
		
	}
	
	@Test
	public void testCarPark() {
		Vehicle v = new Car(new Bell());
		Carpark cp = new Carpark();
		cp.enter(v);
		System.out.println(cp.getParkedVehicles().size());
		assertTrue(cp.getParkedVehicles().size() == 1);
	}
	
	
	
}
