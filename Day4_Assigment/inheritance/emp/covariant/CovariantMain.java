package inheritance.emp.covariant;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 10 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/

import inheritance.emp.Employee;
import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

public class CovariantMain {
	public static void main(String[] args) {
		EmployeeData ed=new EmployeeData();
		Employee e=ed.getEmployee();
		
		ManagerData md=new ManagerData();
		Manager m=md.getEmployee();
		m.display();
		
		WageEmpData wed=new WageEmpData();
		WageEmp we=wed.getEmployee();
		we.display();
		
	}
}
