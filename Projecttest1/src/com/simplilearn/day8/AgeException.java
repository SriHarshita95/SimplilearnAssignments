package com.simplilearn.day8;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String toString() {
		return "Age is less than 18 years, no license";
	}
}
class OverAgeException extends Exception{
	public String toString() {
		return "Age is greater than 65 years, no license";
	}
}

class Person {
	int age;
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the person age: ");
		age=sc.nextInt();	
	}
	void verify() throws  UnderAgeException,OverAgeException{
		if(age>=18 && age<=65) {
			System.out.println("Give the license");
		}
		else if(age<18){
			UnderAgeException uae =new UnderAgeException();
			System.out.println(uae.toString());
			throw uae;
		}
		else {
			OverAgeException oae =new OverAgeException();
			System.out.println(oae.toString());
			throw oae;
		}
	}
}

class License {
	void PersonCheck() {
		Person p1=new Person();
		p1.collectData();
			try {
				p1.verify();
			} catch (UnderAgeException | OverAgeException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
	}
}

public class AgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		License g=new License();
		g.PersonCheck();
	}

}
