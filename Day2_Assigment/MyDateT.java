/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
// MyDateP class 
public class MyDateT {
	//data members
	private int day;
	private int month;
	private int year;
	
	//default constructor
	public MyDateT(){
		day=10;
		month=10;
		year=2021;
	} 
	// paramiterized constructor
	public MyDateT(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	// this method prints date;
	public void printDate() {
		System.out.println("Date is "+day+"/"+month+"/"+year);
	}

}