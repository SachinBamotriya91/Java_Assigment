
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
public class MyDateSG {
	//data members
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//default consturctor
	public MyDateSG(){
	}
	// paramiterized constructor
		public MyDateSG(int day,int month,int year) {
			this.day=day;
			this.month=month;
			this.year=year;
		}
	//printDate() method is used to print date
	public void printDate(){
		System.out.println("Date is "+day+"/"+month+"/"+year);
	}

}