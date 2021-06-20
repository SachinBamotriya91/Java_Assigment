package com.phoenix.machines;

import com.phoenix.interfaces.Moveble;

public class Robot implements Moveble{

	@Override
	public void move() {
		System.out.println("Robot is Moving");
	}
	public void processData(){
		System.out.println("Robot Data is Being Processed");
	}
	public void senseInfo(){
		System.out.println("Robot SenseInformation");
	}
	public void useArtificialIntelligence(){
		System.out.println("Using AI in Robot ");
	}

}
