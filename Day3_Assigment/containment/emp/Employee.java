package containment.emp;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 9 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
import containment.date.MyDate;

public class Employee {
	//DATA MEMBERS
	private int empId;
	private String name;
	private MyDate birthDate;
	
	//DEFAULT CONSTRCUTOR
	public Employee() {}
	
	//PARAMETERIZED CONSTRUCTOR
	public Employee(int empId,String name,MyDate birthDate) {
		this.empId=empId;
		this.name=name;
		this.birthDate=birthDate;
	}
	//GETTER SETTER METHDOS
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	//DISPLAY METHOD DISPLAY EMPLOYEE DETAILS
	public void display() {
		System.out.println("Employee Id :"+empId+" , "+"Employee Name :"+name+" , "+"Employee BirthDate :"+birthDate);
	}
	
	public String toString() {
		return ("Employee Id :"+empId+" , "+"Employee Name :"+name+" , "+"Employee BirthDate :"+birthDate);
	}

}