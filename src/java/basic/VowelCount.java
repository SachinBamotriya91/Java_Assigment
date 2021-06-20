package java.basic;
/*
* Author: sachin.bamotriya@stltech.in
* Creattion Date: 8 June 2021
* Version 1.1
* Copyright: Sterlite Technologies Ltd.
*/

//this code will handle number of vowel in string
public class VowelCount {
	// countVowels() method will return number of vowels present in string
	public static int countVowels(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
				|| ch=='A' || ch=='E' ||ch=='I' || ch=='O' || ch== 'U') {
				count++;
				
			}
		}
		return count;
	}
	// program execution will be start from main method 
	public static void main(String[] args) {
		String str="hello";
		System.out.println("Number of Vowels in "+str+" is "+countVowels(str));
		// TODO Auto-generated method stub

	}

}