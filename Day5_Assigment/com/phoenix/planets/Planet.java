package com.phoenix.planets;

import com.phoenix.interfaces.Moveble;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;
import com.phoenix.interfaces.Runnable;

public abstract class Planet implements Moveble,Rotatable,Revolvable {
	private int noOfMoons;

	public int getNoOfMoons() {
		return noOfMoons;
	}

	public void setNoOfMoons(int noOfMoons) {
		this.noOfMoons = noOfMoons;
	}
	protected abstract boolean supportsLife();
	
	public String toString(){
		return noOfMoons+"";
	}
	
}
