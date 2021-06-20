package com.phoenix.designpatterns.singleton;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 18 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class Sun {
	private static Sun ref;
	
	private Sun(){
		System.out.println("Sun Object has been Created");
	}
	
	public static Sun getInstance(){
		System.out.println("Sun getInstance Called");
		if(ref==null){
			ref=new Sun();
			return ref;
		}
		return ref;
	}
	public void giveLight(){
		System.out.println("Sun Gives Light");
	}

}
