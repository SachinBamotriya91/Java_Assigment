package java.basic;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/

public class PrimeNumber {
	public static String isPrime(int num) {
		int sqrt=(int)Math.sqrt(num);
		for(int i=2;i<=sqrt;i++) {
			if(num%i==0) {
				return "Number is not Prime";
			}
		}
		return "Number is  Prime";
	}
	
		
	public static void main(String[] args) {
		int num=50;
	
		System.out.print(isPrime(num));

	}

}