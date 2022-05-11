package com.simplilearn.day3;

import java.util.Scanner;

public class Calculator {
	
	double addition(double a, double b) {
		System.out.println("Addition of two numbers is : ");
		return a+b;
	}
	
	double sub(double a, double b) {
		System.out.println("Subtraction of two numbers is : ");
		return a-b;
	}
	
	double mul(double a, double b) {
		System.out.println("Multiplication of two numbers is : ");
		return a*b;
	}
	
	double div(double a, double b) {
		System.out.println("Division of two numbers is : ");
		return a/b;
	}
	
	double mod(double a, double b) {
		System.out.println("Modulus of two numbers is : ");
		return a%b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the calculation operation to do: 1)Addition 2)Subtraction 3)Multiplication 4)Division 5)Modulus ");
		int option=sc.nextInt();
		System.out.println("Enter the 2 values to perform selected operation");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		switch(option) {
		case 1:
			System.out.println(c.addition(a, b));
			break;
		case 2:
			System.out.println(c.sub(a, b));
			break;
		case 3:
			System.out.println(c.mul(a, b));
			break;
		case 4:
			System.out.println(c.div(a, b));
			break;
		case 5:
			System.out.println(c.mod(a, b));
			break;
		}
		
	}

}
