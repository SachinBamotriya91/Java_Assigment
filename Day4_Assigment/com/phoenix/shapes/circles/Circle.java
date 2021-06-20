package com.phoenix.shapes.circles;

import com.phoenix.shapes.Shape;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 14 June 2021
 * Version 1.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class Circle extends Shape{
	private float radius;

	public Circle() {
		System.out.println("Circle Default ");
	}
	
	public Circle(float radius) {
		this.radius=radius;
		System.out.println("Circle Parameterized Constructor");
	}
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle :"+radius*radius*super.MATH_PI);
		
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Circle :"+2*super.MATH_PI*radius);
		System.out.println("***************************");
		
	}
	

}