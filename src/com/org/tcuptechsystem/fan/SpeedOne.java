package com.org.tcuptechsystem.fan;


class SpeedOne implements State {
	
	

	public void pull(CeilingFanPullCord pull) {

		if (pull instanceof CeilingFanPullCordAntiClockWise) {
			pull.setSpeed(new Off());
			System.out.println("decreasing speed to off/speed 0");

		}

		else if (pull instanceof CielingFanPullCordClockWise) {
			pull.setSpeed(new SpeedTwo());
			System.out.println("increasing speed to 2");
		}

		
	}
	
	@Override
	public String toString() {
		
		return "Speed 1";
	}
}