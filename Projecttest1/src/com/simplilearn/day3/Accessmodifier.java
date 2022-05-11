package com.simplilearn.day3;

class defAccessSpecifier
{ 
  void display() //default : available only within same package
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 
class defPAccessSpecifier
{ 
  private void display() //private : only within the class
     { 
         System.out.println("You are using private access specifier"); 
     } 
} 
class defprotAccessSpecifier
{ 
  protected void display() //protected : available within same package and also inheritance class
     { 
         System.out.println("You are using prtected  access specifier"); 
     } 
} 
public class Accessmodifier {
    public static void main(String[] args) {
        //default
        System.out.println("Dafault Access Specifier");
        defAccessSpecifier obj1 = new defAccessSpecifier(); //object for default access specifier          
        obj1.display(); 
        
        System.out.println("private Access Specifier");
        defPAccessSpecifier obj2 = new defPAccessSpecifier(); //object for private access specifier           
       //obj2.display(); 
        
        System.out.println("prtected Access Specifier");
        defprotAccessSpecifier obj3 = new defprotAccessSpecifier(); //object for protected access specifier
        obj3.display();
    }
}