package inheritance.emp.wage;

import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 10 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class WageEmpData extends EmployeeData {
	public WageEmp getEmployee(){
		return new WageEmp();
	}
}
