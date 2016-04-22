package com.codeclan.md;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class InstrumentTest 
{
	@Test
	public void testInstrument() {
	   Guitar g = new Guitar();
	   System.out.println(g.play());
   }
	
	@Test
	public void testLotsOfInstruments(){
		Guitar g = new Guitar();
		HurdyGurdy h = new HurdyGurdy();
		Triangle t = new Triangle();
		System.out.println(g.play());
		System.out.println(h.play());
		System.out.println(t.play());
	}
	
	@Test
	public void testCollectionOfInstruments() {
		Instrument g = new Guitar();
		Instrument h = new HurdyGurdy();
		Instrument t = new Triangle();
		ArrayList<Instrument> instruments = new ArrayList<>();
		instruments.add(g);
		instruments.add(h);
		instruments.add(t);
		for (Instrument i: instruments) {
			System.out.println(i.play()+" from collection!");
		}
	}
}
