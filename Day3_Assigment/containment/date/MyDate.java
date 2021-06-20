package containment.date;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 9 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class MyDate {
	//instance data members
	private int day;
	private int month;
	private int year;
	
	//Default Constructor
	public MyDate() {}
	
	//Parameterized Constructor
	public MyDate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	//Getter and Setter Methods 

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
	//this method prints date 
	public void printDate() {
		System.out.println("Date is "+day+"/"+month+"/"+year);
	}
	// toString Method represnt an object as a string
	public String toString() {
		return (day+"/"+month+"/"+year);
	}
}