package com.nisha.Day4;
import java.util.Scanner;

public class ex1 {
	public static void main(String []args){
		UserMainCode u=new UserMainCode();
		Scanner input = new Scanner(System.in);
		String enter=input.nextLine();
		int ch = u.checkCharacters(enter);
		if(ch==1) {
			System.out.print("Valid");
		}
		else {
			System.out.print("Invalid");
		}
	}
}
