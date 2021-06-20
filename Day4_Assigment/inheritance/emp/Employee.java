package inheritance.emp;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 10 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class Employee {
	//data members
	private int empId;
	private String name;
	private double salary;
	
	//Default Constructor;
	public Employee() {
		
		System.out.println("Employee Default Constructor");
		System.out.println();
	}
	
	//Parameterized Constructor
	
	public Employee(int empId,String name,double salary) {
		this.empId=empId; 
		this.name=name;
		this.salary=salary;
		
		System.out.println("Employee ParaMeterized Constructor");
		System.out.println();
	}
	
	protected void display() {
		System.out.println("Employee Display");
		System.out.println("Employee Id :"+empId+" , "+"Employee Name: "+name+" , "+"Employee Salary :"+salary);
	}
	
	public String toString() {
		return("Employee Id :"+empId+" , "+"Employee Name :"+name+" , "+"Employee Salary :"+salary+" ");
	}

}