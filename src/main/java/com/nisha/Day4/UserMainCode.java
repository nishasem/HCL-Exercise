package com.nisha.Day4;

public class UserMainCode {
	public static int checkCharacters(String check) {
		int x = check.length()-1;
		if (check.charAt(0)==check.charAt(x)) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
