package inheritance;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 10 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;

public class RTTIMain {

	public static void showEmpInfo(Employee emp) {
		if(emp instanceof Manager){
			((Manager)emp).display();
		}
		else if(emp instanceof WageEmp){
			((WageEmp)emp).calculateWage();
			((WageEmp)emp).display();
		}
	}
	public static void main(String[] args) {
		Manager mg=new Manager(100,"Akib",1000.5,5000);
		showEmpInfo(mg);
		System.out.println();
		WageEmp we=new WageEmp(101,"Gajendra",5,100);
		showEmpInfo(we);
		
	}

}