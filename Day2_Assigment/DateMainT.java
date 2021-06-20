/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
// this class will handle objects  creation of MyDateP CLass
public class DateMainT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDateT mdp=new MyDateT();
		MyDateT mdp1=new MyDateT(8,6,2021);
		mdp.printDate();
		mdp1.printDate();		

	}

}