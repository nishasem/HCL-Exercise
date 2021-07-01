package com.nisha.Day4;
import java.util.Scanner;

public class ex4 {
	public static void main(String []args) {
		Vowels v=new Vowels();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input:");
		String str=scan.nextLine();
		System.out.print("Vowels in the String: "+v.vow(str));
	}
}
