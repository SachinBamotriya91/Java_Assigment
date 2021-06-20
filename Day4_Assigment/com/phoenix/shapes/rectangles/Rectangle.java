package com.phoenix.shapes.rectangles;

import com.phoenix.shapes.Shape;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 14 June 2021
 * Version 1.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class Rectangle extends Shape{
	//Data Members
	private int length;
	private int breadth;
	
	//Default Constructor
	public Rectangle() {
		System.out.println("Rectangle Default Constructor");
	}
	
	//parameterized constructor
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
		System.out.println("Rectangle Parameterized Constructor");
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
		System.out.println("Area of Rectnagle :"+length*breadth);
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Rectangle :"+2*(length+breadth));
		System.out.println("************************************");
	}
	
	 
}