package com.org.tcuptechsystem.fan;


class SpeedTwo implements State {

	
	public void pull(CeilingFanPullCord pull) {

		if (pull instanceof CeilingFanPullCordAntiClockWise) {
			pull.setSpeed(new SpeedOne());
			System.out.println("decreasing speed to 1");

		} else if (pull instanceof CielingFanPullCordClockWise) {
			pull.setSpeed(new SpeedThree());
			System.out.println("increasing speed to 3 ");
		}
		

	}
	
	@Override
	public String toString() {
		
		return "Speed 2";
	}
}