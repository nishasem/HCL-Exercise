package com.nisha;

public class InheritanceExample {
	public static void main(String []args){
		Bike M=new Bike();
		Animal ana=new Animal();
		Dog dog=new Dog();
		dog.walk();
		dog.eat();
		dog.bark();
		System.out.println(ana.makeNoise("overriding"));
		System.out.println(dog.makeNoise("not overriding"));
		}
}
