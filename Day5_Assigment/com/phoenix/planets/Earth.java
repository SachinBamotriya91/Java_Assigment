package com.phoenix.planets;

public class Earth extends Planet {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Earth is Moving");
		
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Earth is Rotating");
		
	}

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Earth is Revolving");
		
	}

	@Override
	protected boolean supportsLife() {
		// TODO Auto-generated method stub
		return true;
	}
	public String toString(){
		return "Number of Moons :"+getNoOfMoons();
	}

}
