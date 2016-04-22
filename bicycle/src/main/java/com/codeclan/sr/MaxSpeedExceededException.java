package com.codeclan.sr;

public class MaxSpeedExceededException extends Exception {
	public MaxSpeedExceededException() {
		super("Attempting to Exceed Max Speed");
	}
}
