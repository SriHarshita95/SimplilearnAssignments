package com.simplilearn.day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "[a-z]+";
	    String check = "Bheem Expressions";
	    Pattern p = Pattern.compile(pattern);
	    Matcher c = p.matcher(check);
	    
	    while (c.find())
	          System.out.println( check.substring( c.start(), c.end() ) );
	    }
		//Assignment:		
				//WAP to demonstrate the Quatifiers
				//WAP to demonstrate the Meta Characters
				//WAP to demonstrate the patterns
	}

