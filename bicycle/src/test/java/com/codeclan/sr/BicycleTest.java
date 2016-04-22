package com.codeclan.sr;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class BicycleTest 
{
	@Test
	public void testBicycle() {
		Bicycle b = new Bicycle();
		assertTrue(b.getColour().equals("pink"));
	}
	
	@Test
	public void testRedBicycle() {
		Bicycle redBike = new Bicycle("red");
		assertTrue(redBike.getColour().equals("red"));
	}
	
	@Test
	public void testChangeGear() {
		Bicycle b = new Bicycle(2, 21);
		b.changeGear(3);
		assertTrue(b.getGear() == 3);
	}
	
	@Test (expected=MaxSpeedExceededException.class)
	public void testSpeedUp() throws MaxSpeedExceededException {
		Bicycle b = new Bicycle("blue", 21, 21);
		try {
			b.speedUp();
		} catch (MaxSpeedExceededException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	
	@Test
	public void testStringBicycle() {
		Bicycle b = new Bicycle("red", 3, 21);
		System.out.println(b);
		assertTrue(true);
	}
	
	@Test
	public void testBikeShed() {
		Bicycle b1 = new Bicycle("black",2,21);
		Bicycle b2 = new Bicycle("blue",2,5);
		Bicycle b3 = new Bicycle("green",2,16);
		
		ArrayList<Bicycle> bikeShed = new ArrayList<>();
		bikeShed.add(b1);
		bikeShed.add(b2);
		bikeShed.add(b3);
		System.out.println(bikeShed);
		assertTrue(bikeShed.size() == 3);
	}
	
	
}
