package com.phoenix.designpatterns.factory.cars;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 18 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class Car {
	public void start(){
		System.out.println("Car Starts");
	}
	public void run(){
		System.out.println("Car Running");
	}
	public void stop(){
		System.out.println("Car Stopping");
	}
}
