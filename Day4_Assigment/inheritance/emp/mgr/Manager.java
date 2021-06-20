package inheritance.emp.mgr;

import inheritance.emp.Employee;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 10 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class Manager extends Employee {
	//data members
	private double incentives;
	
	//default constructor
	public Manager() {
		incentives=5000;
		System.out.println("Manager Default Construcotr");
		System.out.println();
	}
	
	//parameterized constructor
	
	public Manager(int empId,String name,double salary,double incentives) {
		super(empId,name,salary);
		this.incentives=incentives;
		System.out.println("Manager Parametized Constructor");
		System.out.println();
	}
	public void showIncentives() {
		System.out.println("Incentives :"+incentives);
		System.out.println();
	}
	
	public void display() {
		super.display();
		System.out.println("Manager Incentives :"+incentives);
		System.out.println();
		
	}
	public String toString() {
		System.out.println();
		return (super.toString()+" , "+"Manager Incentives :"+incentives);
	}
}
