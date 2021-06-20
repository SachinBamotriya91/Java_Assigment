package java.basic;
/*
 * Author: sachin.bamotriya@stltech.in
 * Creation Date: 8 June 2021
 * Version 1.1
 * Copyright: Sterlite Technologies Ltd.
*/

public class Customer {
	private int customerId;
	private String name;
	private int age;
	private String city;
	int pincode;
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
		}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Customer() {	}
	public Customer(int customerId,String name,int age,String city,int pincode){
		this.customerId=customerId;
		this.name=name;
		this.age=age;
		this.city=city;
		this.pincode=pincode;
	}
	
	public void printDetails() {
		System.out.println("Customer Id :"+getCustomerId()+" , Name : "+getName()+" , Age :"+" , "+getAge()+" , City :"+getCity()+", Picode :"+getPincode());
	}
}