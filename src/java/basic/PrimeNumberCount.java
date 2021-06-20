package java.basic;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
public class PrimeNumberCount {
	public static void primeCount(int count) {
		int num=2;
		while(count!=0) {
			
			if(isPrime(num)) {
				System.out.print(num+" ");
				count--;
			}
			num++;
		}
	}
	public static  boolean isPrime(int num) {
		if(num==2 || num==1) {
			return true;
		}
		int sqrt=(int)Math.sqrt(num);
		for(int i=2;i<=sqrt;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num=3;
		primeCount(num);

	}

}