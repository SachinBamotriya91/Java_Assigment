package java.basic;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creattion Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/

public class Factorial {
	public static void main(String args[]) {
		int num=5;
		int factorial=fact(num);
		if(factorial>0)
			System.out.println(factorial);		
	}
	public static int fact(int num) {
		if(num<0) {
			System.out.print("Negetive Number");
			return 0;
		}
		if(num==0) {
			return 1;
		}
		return num*fact(num-1);
		
	}
	
}