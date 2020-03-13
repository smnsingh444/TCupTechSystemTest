package com.org.tcuptechsystem.fan;

public class StartFan {
	
	private static int PULL_COUNT_CLOCK_WISE=5;
	private static int PULL_COUNT_ANTI_CLOCK_WISE=6;
	
	
 
	public static void main(String[] args) {
		
	
		
        CeilingFanPullCord straigntcord = new CielingFanPullCordClockWise();
       
        System.out.println("************** cord is pulled clockwise**********");
        for (int i = 0; i < PULL_COUNT_CLOCK_WISE; i++) {
             straigntcord.pull();
		}
        
        //test for reverse
        System.out.println("************** cord is pulled anti-clockwise**********");
        CeilingFanPullCord reverseCord = new CeilingFanPullCordAntiClockWise(straigntcord);
        for (int i = 0; i < PULL_COUNT_ANTI_CLOCK_WISE; i++) {
            reverseCord.pull();
		}
        
        System.out.println("************** cord is pulled clockwise again **********");
        straigntcord.setSpeed(reverseCord.getSpeed());
        for (int i = 0; i < PULL_COUNT_CLOCK_WISE; i++) {
        	straigntcord.pull();
		}
        
        System.out.println("************** cord is pulled anti-clockwise**********"); 
        reverseCord.setSpeed(straigntcord.getSpeed());
        for (int i = 0; i < PULL_COUNT_ANTI_CLOCK_WISE; i++) {
        	reverseCord.pull();
		}
        
    }


}
