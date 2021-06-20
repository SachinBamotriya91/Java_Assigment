package java.basic;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/

public class MultiplicationTable {
	public static void mulTable(int n) {
		for(int row=1;row<=10;row++) {
			System.out.println(n+"*"+row+"="+n*row);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		mulTable(num);

	}

}
