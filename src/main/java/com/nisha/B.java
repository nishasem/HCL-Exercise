package com.nisha;

public class B extends A{
	public void bmethod() {
		System.out.println("b method called");
		A aobj=new A();
		aobj.amethod();
	}
}

