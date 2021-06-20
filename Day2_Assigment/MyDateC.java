/*
 * Author: sachin.bamotriya@stltech.in
 * Creattion Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
//this class will handle date parts;
public class MyDateC {
	//data members
	private int day,month,year;
	
	// default constructor which is used to give default vale to data memebers
	public MyDateC() {
		day=8;
		month=6;
		year=2021;
	}
	//printDate() method is used to print date
	public void printDate() {
			System.out.println("Date is "+day+"/"+month+"/"+year);
	}
}