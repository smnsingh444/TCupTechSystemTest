package com.org.tcuptechsystem.fan;

public class CielingFanPullCordClockWise extends CeilingFanPullCord {

	// Assuming Fan will be initially in Off state
	public CielingFanPullCordClockWise() {
		currentSpeed = new Off();
	}

	@Override
	public String toString() {

		return "cord";
	}

}
