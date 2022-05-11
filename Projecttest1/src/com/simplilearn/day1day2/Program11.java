package com.simplilearn.day1day2;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=25;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(k<=9)
				System.out.print("0"+k-- + "	"); 
				else
					System.out.print(k-- + "	"); 
			}
			System.out.println();
		}
	}

}
