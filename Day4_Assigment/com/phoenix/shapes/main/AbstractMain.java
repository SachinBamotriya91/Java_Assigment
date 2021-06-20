package com.phoenix.shapes.main;

import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 14 June 2021
 * Version 1.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1,s2,s3;
		s1=new Circle(4.5f);
		s1.calculateArea();
		s1.calculatePerimeter();
		
		s2=new Rectangle(4,5);
		s2.calculateArea();
		s2.calculatePerimeter();
		
		s3=new Square(4);
		s3.calculateArea();
		s3.calculatePerimeter();
		
	}

}