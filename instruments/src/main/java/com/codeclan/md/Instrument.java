package com.codeclan.md;

/**
 * I am an instrument!
 *
 */
public abstract class Instrument 
{
	protected String name;
	protected String type;
	
	public String play() {
		return "Name: " +name+ ", Type: "+type;
	}
}
