package java.basic;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
public class CustomerMain {

	public static void main(String[] args) {
		Customer cs=new Customer();
		cs.setName("Sachin");
		String name=cs.getName();
		System.out.println("Name:"+name);
		Customer cs1=new Customer(101,"Sachin",21,"Indore",453115);
		cs1.printDetails();
	}

}