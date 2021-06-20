package com.phoenix.designpatterns.factory.main;

import java.util.Scanner;
import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.Car;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 18 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class FactoryMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Car Type :");
		String ss=scan.nextLine();
		Car c=CarFactory.newCar(ss);
		c.start();
		c.run();
		c.stop();
	}
}
