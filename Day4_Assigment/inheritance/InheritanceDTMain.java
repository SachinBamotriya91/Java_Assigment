package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 16 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em,em1;
		em=new Manager(104,"Aakash",55000,5000);
		System.out.println("**********Manager Display ********");
		((Manager)em).display();
		((Manager)em).showIncentives();
		em1=new WageEmp(103,"Ramkumar",5,500);
		((WageEmp)em1).display();
		((WageEmp)em1).calculateWage();
		
		
		

	}

}