package com.nisha.Day4;
import java.util.Scanner;

public class ex3 {
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str=scan.nextLine();
		MiddleChar s=new MiddleChar();
		s.middle(str);
	}
}
