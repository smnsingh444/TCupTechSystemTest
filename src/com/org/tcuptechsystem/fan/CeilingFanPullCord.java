package com.org.tcuptechsystem.fan;

public abstract class CeilingFanPullCord {
	
    protected State currentSpeed;
  

    public void setSpeed(State speed) {
        currentSpeed = speed;
    }
    
    public State getSpeed()
    {
    	return currentSpeed;
    }

    public void pull() {
        currentSpeed.pull(this);
    }
    
    @Override
    public String toString()
    {
		return null;
    	
    }
}