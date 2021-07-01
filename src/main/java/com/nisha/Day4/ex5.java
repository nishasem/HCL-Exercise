package com.nisha.Day4;
import java.util.Scanner;

public class ex5 {
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1=scan.nextInt();
		System.out.print("Enter second number: ");
		int n2=scan.nextInt();
		
		scan.nextLine();
		System.out.print("Enter operation(add,sub,mult,div): ");
		String op=scan.nextLine();
		
		Calculator c=new Calculator();
		if(op.equals("add")) {
			c.add(n1,n2);
		}
		if(op.equals("sub")) {
			c.sub(n1,n2);
		}
		if(op.equals("mult")) {
			c.mult(n1,n2);
		}
		if(op.equals("div")) {
			c.div(n1,n2);
		}
		scan.close();
	}
}
