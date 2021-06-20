package com.phoenix.designpatterns.singleton;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 18 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class PrimeMinister {
	private static PrimeMinister ref;
	
	private PrimeMinister(){
		System.out.println("Prime Minister Object has been Created");
	}
	
	public static PrimeMinister getInstance(){
		System.out.println("Prime Minister getInstance Called");
		if(ref==null){
			ref=new PrimeMinister();
			return ref;
		}
		return ref;
	}
	public void serveNation(){
		System.out.println("Prime Minister is Serving Nation");
	}

}
