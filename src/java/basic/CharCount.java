package java.basic;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/

public class CharCount {
	public static int charCount(String str,char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str= "Hello";
		char ch='l';
		int  occurenece=charCount(str, ch);
		System.out.print(occurenece);
		// TODO Auto-generated method stub

	}

}
