package java.basic;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
public class Fibonacii {
	
public static void Fibo(int num) {
	int a=0,b=1,c=0;
	for(int i=0;i<num;i++) {
		System.out.print(c+" ");
		c=a+b;
		a=b;
		b=c;
	}
}
	public static void main(String[] args) {
		int num=10;
		Fibo(num);

	}

}