package com.nisha.Day4;

public class ex2 {
	public static void main(String []args){
		String a = "cat";
		String b = "cat";
		System.out.println(a==b);
		
		a= new String("cat");
		System.out.println(a==b);
		
		StringBuilder str=new StringBuilder("cat");
		System.out.println(str);
		str = str.append("dog");
		System.out.print(str);
	}
}
