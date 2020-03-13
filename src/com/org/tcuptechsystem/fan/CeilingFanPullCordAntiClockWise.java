package com.org.tcuptechsystem.fan;

public class CeilingFanPullCordAntiClockWise extends CeilingFanPullCord {

	// Reverse can only be performed only if Fan state has been changed atleast once
	public CeilingFanPullCordAntiClockWise(CeilingFanPullCord pull) {
		currentSpeed = pull.getSpeed();
	}

	@Override
	public String toString() {

		return "reverse cord";
	}

}
