package com.phoenix.machines;

import com.phoenix.interfaces.Walkable;

public class HumanRobot extends Robot implements Walkable{

	@Override
	public void jump() {
		System.out.println("HumanRobot is Jumping");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("HumanRobot is Running");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("HumanRobot is Walking");	
	}
	public String toString(){
		return "Human RObot TOString";
	}

}
