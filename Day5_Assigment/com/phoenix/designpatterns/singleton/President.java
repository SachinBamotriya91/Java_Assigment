package com.phoenix.designpatterns.singleton;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 18 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/

public class President {
	private static President ref;
	
	private President(){
		System.out.println("President Object has been Created");
	}
	
	public static President getInstance(){
		System.out.println("President getInstance Called");
		if(ref==null){
			ref=new President();
			return ref;
		}
		return ref;
	}
	public void representNation(){
		System.out.println("President Represents Nation");
	}

}
