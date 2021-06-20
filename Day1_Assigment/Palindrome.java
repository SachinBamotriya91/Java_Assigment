/*
 * Author: sachin.bamotriya@stltech.in
 * Creattion Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
public class Palindrome {
	// this methods chekcs whether a string is palindromeor or not
	public static boolean checkPalindrome(String s) {
		int left=0;
		int right=s.length()-1;
		while(left<=right) {
			if(s.charAt(left)!=s.charAt((right))){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s="malayalam";
		if(checkPalindrome(s))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	
	}

}