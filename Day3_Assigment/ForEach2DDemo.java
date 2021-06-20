/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
public class ForEach2DDemo {
	public static void main(String[] args) {
		int arr[][]=new int[2][2];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;
		
		for(int a[]:arr){
			for(int b:a ){
				System.out.println(b);
			}
		}
	}
}
