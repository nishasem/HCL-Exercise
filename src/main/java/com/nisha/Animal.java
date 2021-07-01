package com.nisha;

public class Animal {
	void walk() {
		System.out.println("I am walking");
	}
	public String furColor;
	public String makeNoise(String str) {
		System.out.println("barking");
		System.out.println(furColor);
		return str;
	}
	Animal(){
		furColor= "brown";
	}
	public void getMakeNoise() {
		Animal ab=new Animal();
		ab.makeNoise("");
	}
}	
	
