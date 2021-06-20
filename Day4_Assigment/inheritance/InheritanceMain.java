package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 10 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/

public class InheritanceMain {
	public static void main(String[] args) {
		
		Employee em=new Employee(101,"Nalin",4000);
		//em.display();
		System.out.println("******Employee TOString Method****");
		System.out.println(em);
		
		System.out.println("*****Manager *****");
		Manager mg=new Manager();
		mg.showIncentives();
		
		mg.display();
		
		System.out.println("******Manager ToString*****");
		System.out.println(mg);
		
		System.out.println();
		Manager mgp=new Manager(102,"Raja",45000,5000);
		mgp.showIncentives();
		mgp.display();
		
		System.out.println();
		
		System.out.println("********WageEmp ****************");
		WageEmp we=new WageEmp();
		we.calculateWage();
		we.display();
		
		System.out.println("******Wage Emp  ToString Method*******");
		System.out.println(we);
		
		
		WageEmp wep=new WageEmp(103,"Ramkumar",5,500);
		System.out.println(wep);
		
	}
}