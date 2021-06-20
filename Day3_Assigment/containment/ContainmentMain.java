package containment;

import containment.date.MyDate;
import containment.emp.Employee;

/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 9 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class ContainmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=new Employee();
		em.setEmpId(101);
		em.setName("SAchin");
		em.setBirthDate(new MyDate(10,10,2021));
		int empId=em.getEmpId();
		String name=em.getName();
		MyDate date=em.getBirthDate();
		System.out.println(em);
		
		Employee em1=new Employee(102,"Nilesh",new MyDate(11,11,2010));
		em1.display();
		
		
		
		

	}

}