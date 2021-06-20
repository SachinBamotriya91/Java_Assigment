/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/
public class Account {
	//non static data members
	private int accNo;
	private String ownerName;
	private double balance;
	float durationYears;
	
	//static data members
	private static float interestRate;
	private static int count;
	//static block
	static {
		interestRate=0.05f;
	}
	//default constructor
	public Account() {
		count++;
	}
	//getter and setter methods
	
	//paramiterized constructor
	public Account(int accNo,String ownerName,double balance,float years) {
		this.accNo=accNo;
		this.ownerName=ownerName;
		this.balance=balance;
		this.durationYears=years;
		count++;
	}
	//getter and setter methods for non static memebrs
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public float getDurationYears() {
		return durationYears;
	}
	public void setDurationYears(float durationYears) {
		this.durationYears = durationYears;
	}
	
	//getter and setter methdos for static memebrs
	public static void setInterestRate(float interestRate) {
		Account.interestRate=interestRate;
	}
	
	public static float getInterestRate() {
		return interestRate;
	}
	
	public static void setCount(int count) {
		Account.count=count;
	}
	public static int getCount() {
		return count;
	}
	
	//calculateROI methods;
	public void calculateInterest() {
		double interest=(balance*interestRate*durationYears);
		System.out.println("Total Interest is "+interest);
		
	}
	// printmethod prints Account objects;
	public void printDetails() {
		System.out.println("Account Number :"+accNo);
		System.out.println("Owner Name :"+ownerName);
		System.out.println("Balance :"+balance);
		System.out.println("Duration Years :"+durationYears);
	}

}