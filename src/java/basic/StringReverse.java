package java.basic;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/

public class StringReverse {
	public static String reverse(String str) {
		char arr[]=str.toCharArray();
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			char temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;	
		}
		str=String.valueOf(arr);
		return str;
		
	}
	public static void main(String[] args) {
		String s="Sachin";
		s=reverse(s);
		System.out.print(s);
		
		
	}

}