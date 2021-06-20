package com.phoenix.vehicles.cars;

import com.phoenix.interfaces.Moveble;
import com.phoenix.interfaces.Runnable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Moveble,Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car is Running");
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car is Moving");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car is Starting");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car is Stopping");
		
	}
	public String toString(){
		return "Car toString";
	}

}
