package com.codeclan.md;

public abstract class StringedInstrument extends Instrument {

	protected int numberOfStrings;
	
	
	public String play() {
		StringBuffer str = new StringBuffer(); 
		str.append(super.play());
		str.append(", Number of Strings: "+numberOfStrings+", Type: "+this.getClass().getSuperclass().getSimpleName());
		String result = str.toString();
		return result;
		
	}
	

}
