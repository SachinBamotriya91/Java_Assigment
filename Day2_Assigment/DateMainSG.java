
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDateSG date=new MyDateSG();
		date.setDay(8);
		date.setMonth(6);
		date.setYear(2021);
		
		int day=date.getDay();
		int month=date.getMonth();
		int year=date.getYear();
		System.out.println("Date is "+day+"/"+month+"/"+year);
		
		//objet creation using paramiterized constructor
		MyDateSG date1=new MyDateSG(8,6,2021);
		int day1=date.getDay();
		int month1=date.getMonth();
		int year1=date.getYear();
		System.out.println("Date is "+day1+"/"+month1+"/"+year1);
		

	}

}