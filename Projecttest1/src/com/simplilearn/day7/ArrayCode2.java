package com.simplilearn.day7;

import java.util.Scanner;

public class ArrayCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("-----------Static Approach-------------");
        //multidimensional array
        int[][] b = {
                {2, 4, 6, 8}, 
                {3, 6, 9}, 
        };
        System.out.println("\nLength of row 1: " + b[0].length);
        System.out.println("\nLength of row 2: " + b[1].length);
        Scanner sc = new Scanner(System.in);
        int [][] a1 = new int[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.println("Enter the element no:"+(j+1));
                a1[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.println("the element no:"+(j+1)+" is: "+a1[i][j]);
            }
        }    }
	}

