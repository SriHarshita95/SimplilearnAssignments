package com.simplilearn.day7;

import java.util.Scanner;

public class ArrayCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Single dimentional array using static approach
        System.out.println("-----------Static Approach-------------");
        //single-dimensional array using static approach
        int a[]= {10,20,30,40,50};
        for(int i=0;i<5;i++) {
            System.out.println("Elements of array a: "+a[i]);
        }
        System.out.println("-----------Dynamic Approach-------------");
        //single-dimensional array using dynamic approach
        System.out.println("ENter the array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a1[] = new int[size];
        
        for(int i=0;i<a1.length;i++) {
            System.out.println("Enter the element no:"+(i+1));
            a1[i]=sc.nextInt();
        }
        //Displaying the array elements 
        for(int i=0;i<a1.length;i++) {
            System.out.println("the element no:"+(i+1)+" is: "+a1[i]);
        }
        sc.close();
    }
		
	}

