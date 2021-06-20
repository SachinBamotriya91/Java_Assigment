/*
 * Author: sachin.bamotriya@stltech.in
 * Creattion Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1D Array
		int ar[]=new int [5];
		ar[0]=4;
		ar[4]=5;
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		//creating array withoutusing new keyword
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		String st[]=new String[2];
		st[0]="Indore";
		st[1]="Delhi";
		for(int i=0;i<st.length;i++) {
			System.out.print(st[i]+" ");
		}
		System.out.println();
		
		String hobby[]=new String[2];
		hobby[0]="Problem Solving";
		hobby[1]="Watching Cricket";
		for(int i=0;i<hobby.length;i++) {
			System.out.print(hobby[i]+" , ");
		}
		System.out.println();
		
	}

}