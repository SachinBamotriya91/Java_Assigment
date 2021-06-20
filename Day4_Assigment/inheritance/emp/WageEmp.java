package inheritance.emp;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 10 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class WageEmp extends Employee{
	//data members
	private int noOfHours;
	private float ratePerHour;
	
	//Default Constructor
	public WageEmp() {
		System.out.println("WageEmp Default Constructor");
		System.out.println();
	}
	
	//Parameterized Constructor
	
	public WageEmp(int empId,String name,int hours,float rate) {
		super(empId,name,rate*hours);
		this.noOfHours=hours;
		this.ratePerHour=rate;
		System.out.println("WageEmp Parameterized Constructor");
		System.out.println();
	}
	public void calculateWage() {
		System.out.println("Total Wage :"+noOfHours*ratePerHour);
		System.out.println();
	}
	
	public void display() {
		super.display();
		System.out.println("WageEmp noOfHours : "+noOfHours+"  "+"WageEmp Rate per : "+ratePerHour);
		System.out.println();
	}
	
	public String toString() {
		
		return super.toString()+" , "+"WageEmp Hours :"+noOfHours+"  "+"Rate per Hours : "+ratePerHour;

	}

}