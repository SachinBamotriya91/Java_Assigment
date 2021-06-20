package com.phoenix.planets;

public class Jupiter extends Planet {

	@Override
	public void move() {
		System.out.println("Jupiter Moves");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter Rotates");
		
	}

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter Revolves");
		
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
