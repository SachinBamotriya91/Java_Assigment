package inheritance.emp.mgr;

import inheritance.emp.EmployeeData;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 10 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class ManagerData extends EmployeeData{
	public Manager getEmployee(){
		return new Manager();
	}
}
