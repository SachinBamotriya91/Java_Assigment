
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
// Bank class Handle object creartion of Account Class
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Rate of Interest :"+Account.getInterestRate());
		System.out.println();
		Account ac=new Account();
		ac.setAccNo(101);
		ac.setOwnerName("Sachin");
		ac.setBalance(1000);
		ac.setDurationYears(2);
		
		ac.printDetails();
		ac.calculateInterest();
		System.out.println();
		Account ac1=new Account(102,"Nalin",2000,5);
		ac1.printDetails();
		ac1.calculateInterest();
		System.out.println("Number of Accounts :"+Account.getCount());
		

	}

}