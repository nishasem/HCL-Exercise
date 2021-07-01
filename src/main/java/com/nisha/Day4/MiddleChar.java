package com.nisha.Day4;

public class MiddleChar {
	public void middle(String s) {
		int n= s.length();
		if(n%2==0) {
			System.out.print("The middle characters in the string: "+s.charAt(n/2-1)+" and "+s.charAt(n/2));
		}
		else if(n%2!=0) {
			System.out.print("The middle character in the string: "+s.charAt(n/2));
		}
	}
}
