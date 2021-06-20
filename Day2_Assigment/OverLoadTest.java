/*
 * Author: sachin.bamotriya@stltech.in
 * Creattion Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/

public class OverLoadTest {

	public static void main(String[] args) {
		MathEngine me=new MathEngine();
		System.out.println("Products of Numbers "+me.multiply(2, 3));
		me.multiply(2,3,4);
		System.out.println("Products of Numbers "+me.multiply(2.5f, 3));
		System.out.println("Products of Numbers "+me.multiply(2, 3.4f));
		
		
		

	}

}