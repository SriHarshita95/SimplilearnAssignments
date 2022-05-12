package com.simplilearn.day5;

class Dog{

	//properties
	String name;
	int cost;
	String color;
	String breed;
	
	public Dog(String name, int cost, String color, String breed) {
		this.name=name;
		this.cost=cost;
		this.color=color;
		this.breed=breed;
	}

	//behavior
	void run() {
		System.out.println("dog runs");
	}
	void eat() {
		System.out.println("dog eats");
	}
	void display() {
		System.out.println("Name of the dog is "+name);
		System.out.println("Cost of the dog is "+cost);
		System.out.println("Color of the dog is "+color);
		System.out.println("Breed of the dog is "+breed);
		System.out.println();
	}
}
public class LaunchDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog("rocky",10000,"white","puppy");
		Dog d2=new Dog("jocky",30000,"black","jermanshepad");
		Dog d3=new Dog("socky",20000,"cream","snoopy");
		d1.display();
		d2.display();
		d3.display();
	}

}
