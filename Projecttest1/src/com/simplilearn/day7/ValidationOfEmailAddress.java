package com.simplilearn.day7;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfEmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to search a string entered by a 
		//user from the array of strings
		
		ArrayList<String> emails = new ArrayList<String>();  
        emails.add("simplilearn@domain.co.in");  
        emails.add("simplilearn@domain.com");  
        emails.add("simplilearn.name@domain.com");  
        emails.add("simplilearn#@domain.co.in");  
        emails.add("simplilearn@domain.com");  
        emails.add("simplilearn@domaincom");  
        //Add invalid emails in list  
        emails.add("@yahoo.com");  
        emails.add("simplilearn#domain.com");  
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }
	}

}
