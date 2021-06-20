package com.phoenix.designpatterns.singleton;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 18 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class SingletonMain {
	public static void main(String[] args) {
		Sun s;
		s=Sun.getInstance();
		s.giveLight();
		s=Sun.getInstance();
		s=Sun.getInstance();
		
		System.out.println();
		Earth e;
		e=Earth.getInstance();
		e.creatLife();
		e=Earth.getInstance();
		e=Earth.getInstance();
		System.out.println();
		
		President p;
		p=President.getInstance();
		p.representNation();;
		p=President.getInstance();
		p=President.getInstance();
		System.out.println();
		
		PrimeMinister pm;
		pm=PrimeMinister.getInstance();
		pm.serveNation();
		pm=PrimeMinister.getInstance();
		pm=PrimeMinister.getInstance();
		
	}
}
