/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/

public class Array2DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][]=new int[2][2];
		ar[0][0]=1;
		ar[0][1]=2;
		ar[1][0]=3;
		ar[1][1]=4;
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+"  ");
			}
		}
		System.out.println();
		System.out.println("***********************************");
		
		int  arr[][]=new int[2][4];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=4;
		
		arr[1][0]=5;
		arr[1][1]=6;
		arr[1][2]=7;
		arr[1][3]=8;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
		}
		System.out.println();
	}

}