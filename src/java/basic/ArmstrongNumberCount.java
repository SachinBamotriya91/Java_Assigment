package java.basic;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/

public class ArmstrongNumberCount {
	public  static void armstrongCount(int count) {
		int num=1;
		while(count!=0) {
			if(isArmstrong(num)) {
				System.out.print(num+" ");
				count--;
			}
			num++;
		}
		
	}
	public static boolean isArmstrong(int num) {
		if(num>=1 && num <=9) {
			return true;
		}
		int n=num;
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
			
		}
		
	}

	public static void main(String[] args) {
		int num=10;
		armstrongCount(num);

	}

}