package com.nisha.Day4;

public class Vowels {
	public int vow(String s) {
		int k=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char x=s.charAt(i);
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				k++;
			}
		}
		return k;
	}
}
