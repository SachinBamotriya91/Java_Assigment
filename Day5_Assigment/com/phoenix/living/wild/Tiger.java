package com.phoenix.living.wild;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Tiger extends Animal implements Walkable{

	@Override
	public void jump() {
		System.out.println("Tiger is Jumping");
		
	}

	@Override
	public void run() {
		System.out.println("Tiger is Running");
		
	}

	@Override
	public void move() {
		System.out.println("Tiger is Moving");
		
	}

	@Override
	public void walk() {
		System.out.println("Tiger is Walking");
		
	}
	
	public String toString(){
		return "Tiger toString";
	}

}
