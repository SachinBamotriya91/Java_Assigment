package com.phoenix.shapes.squares;

import com.phoenix.shapes.Shape;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 14 June 2021
 * Version 1.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class Square extends Shape{
	private int side;
	
	//Default Constructor
	public Square() {
		System.out.println("Square Default COnstructor");
	}
	//Parameterized Constructor
	public Square(int side) {
		this.side=side;
		System.out.println("Square Parameterized Constructor");
	}
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Square :"+side*side);
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Square :"+4*side);
		System.out.println("***************************");
		
	}

}