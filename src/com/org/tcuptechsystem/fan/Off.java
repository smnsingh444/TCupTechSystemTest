package com.org.tcuptechsystem.fan;


class Off implements State {
	
	
    public void pull(CeilingFanPullCord pull) {
    	
    	if (pull instanceof CeilingFanPullCordAntiClockWise) {
			pull.setSpeed(new SpeedThree());
			System.out.println("decreasing speed to 3");

		}

		else if (pull instanceof CielingFanPullCordClockWise) {
			pull.setSpeed(new SpeedOne());
			System.out.println("increasing speed to 1");
		}

    }
    
	@Override
	public String toString() {
		
		return "Speed 0";
	}
}
