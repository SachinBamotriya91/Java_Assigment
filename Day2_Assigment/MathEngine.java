/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
public class MathEngine {
	
	// multiply method will return product of two numbers
	public int multiply(int a,int b) {
		return a*b;
	}
	
	// overloaded method
	public void multiply(int a,int b,int c) {
		System.out.println("Prodcurs of Number is "+a*b*c);
	}
	
	// overloaded method
	public float multiply(float a,int b) {
		return a*b;
	}
	
	// overloaded method
	public float multiply(int a,float b) {
		return a*b;
	}

}
