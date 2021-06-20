import containment.date.MyDate;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 9 June 2021
 * Version 3.0
 * Copyright: Sterlite Technologies Ltd.
*/
public class DateArrayDemo {
	public static void main(String[] args) {
		MyDate md[]=new MyDate[3];
		md[0]=new MyDate(10,10,2021);
		md[1]=new MyDate(11,11,2021);
		md[2]=new MyDate(12,12,2021);
		
		for(MyDate arr:md){
			System.out.println(arr);
		}
	}
}
