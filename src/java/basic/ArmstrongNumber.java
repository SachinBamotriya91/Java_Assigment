package java.basic;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
public class ArmstrongNumber {
	
	public static void armstrong(int num) {
		int n=num;
		int sum=0;
		
		// 152 -> sum=153
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(sum==num) {
			System.out.print("Number is Armstrong");
		}
		else {
			System.out.print("Number is not Armstrong");
			
		}
		
	}

	public static void main(String[] args) {
		int num=153;
		armstrong(num);

	}

}