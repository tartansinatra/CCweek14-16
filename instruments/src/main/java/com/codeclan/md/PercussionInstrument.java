package com.codeclan.md;

public abstract class PercussionInstrument extends Instrument {

	
	protected String material;
	
	@Override
	public String play() {
		StringBuffer str = new StringBuffer();
		str.append(super.play());
		str.append(", Material: "+material+", Type: "+this.getClass().getSuperclass().getSimpleName());
		String result = str.toString();
		return result;
	}
}
