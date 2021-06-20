
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
// MyDateP class 
public class MyDateP {
	//data members
	private int day;
	private int month;
	private int year;
	
	//default constructor
	public MyDateP(){
		day=10;
		month=10;
		year=2021;
	} 
	// paramiterized constructor
	public MyDateP(int d,int m,int y) {
		day=d;
		month=m;
		year=y;
	}
	// this method prints date;
	public void printDate() {
		System.out.println("Date is "+day+"/"+month+"/"+year);
	}

}