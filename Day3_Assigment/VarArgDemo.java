/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/

public class VarArgDemo {
	public static double average(int ... var){
		int avg=0;
		
		for(int a:var){
			avg+=a;
		}
		avg=avg/var.length;
		return avg;
	}
	public static void main(String[] args) {
		System.out.println("Average of First Three Number :"+average(1,2,3));
		System.out.println("Average of First Four Number:"+average(1,2,3,4));
	}

}
