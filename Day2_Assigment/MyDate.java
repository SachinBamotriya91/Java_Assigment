
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
/// This is Date class
public class MyDate {
	//data members
	private int day,month,year;
	
	//initDate()method is used to initialize the date month and year
	public void initDate() {
		day=8;
		month=06;
		year=2021;
	}
	//printDate() method is used to print date
	public void printDate() {
		System.out.println("Date is "+day+"/"+month+"/"+year);
	}
	

}