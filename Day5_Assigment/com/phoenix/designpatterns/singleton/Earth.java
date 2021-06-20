package com.phoenix.designpatterns.singleton;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 18 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class Earth {
	private static Earth ref;
	
	private Earth(){
		System.out.println("Earth Object has been Created");
	}
	
	public static Earth getInstance(){
		System.out.println("Earth getInstance Called");
		if(ref==null){
			ref=new Earth();
			return ref;
		}
		return ref;
	}
	public void creatLife(){
		System.out.println("Create Life Method of Earth Called");
	}
}
