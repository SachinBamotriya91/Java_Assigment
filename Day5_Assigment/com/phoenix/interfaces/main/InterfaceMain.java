package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Moveble;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.vehicles.cars.Car;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moveble m;
		System.out.println("*********** Earth Starts **********");
		m=new Earth();
		((Earth)m).setNoOfMoons(1);
		System.out.println(m.toString());
		((Earth)m).rotate();
		((Earth)m).revolve();
		
		m.move();
		
		System.out.println("*********Earth End************");
		System.out.println();
		
		System.out.println("********Jupiter Starts********");
		m=new Jupiter();
		((Jupiter)m).setNoOfMoons(2);
		System.out.println(m.toString());
		m.move();
		((Jupiter)m).revolve();
		((Jupiter)m).rotate();
		System.out.println("************Jupiter Ends*************");
		System.out.println();
		
		System.out.println("**********Tiger Starts************");
		m=new Tiger();
		m.move();
		((Tiger)m).jump();
		((Tiger)m).run();
		((Tiger)m).walk();
		System.out.println(((Tiger)m).toString());
		System.out.println("***********Tiger Ends**************");
		System.out.println();
		
		System.out.println("********Cat Starts***********");
		
		m=new Cat();
		m.move();
		((Cat)m).jump();
		((Cat)m).run();
		((Cat)m).walk();
		System.out.println(((Cat)m).toString());
		System.out.println("***********Cat Ends**************");
		System.out.println();
		
		System.out.println("*********Car Starts**********");
		m=new Car();	
		((Car)m).start();
		((Car)m).run();
		m.move();
		((Car)m).stop();
	
		System.out.println(m.toString());
		System.out.println("**********Car Ends*****************");
		System.out.println();
		
		System.out.println("********HumanRobot ***********");
		m=new HumanRobot();
		m.move();
		((HumanRobot)m).jump();
		((HumanRobot)m).run();
		((HumanRobot)m).walk();
		((HumanRobot)m).processData();
		((HumanRobot)m).senseInfo();
		((HumanRobot)m).useArtificialIntelligence();
		System.out.println(m.toString());
		System.out.println("**********Human Robot Ends ***********");
	}

}
