package com.simplilearn.day8;

import java.util.Scanner;

class InvalidCustomerException extends Exception{
	public String toString() {
		return "Invalid Customer";
	}
}

class Customer {
	int accno=111;
	int pin=234;
	int accno1;
	int pin1;
	
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number: ");
		accno1=sc.nextInt();
		System.out.println("Enter the pin number: ");
		pin1=sc.nextInt();	
	}
	void verify() throws InvalidCustomerException{
		if(accno==accno1 && pin==pin1) {
			System.out.println("Valid Customer");
		}
		else {
			InvalidCustomerException ice =new InvalidCustomerException();
			System.out.println(ice.toString());
			throw ice;
		}
	}
}

class Bank {
	void customerCheck() {
		Customer c1=new Customer();
		c1.collectData();
		try {
			c1.verify();
		} catch (InvalidCustomerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.customerCheck();
	}

}
