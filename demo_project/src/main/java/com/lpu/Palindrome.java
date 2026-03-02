package com.lpu;

public class Palindrome {
	public static boolean palindrome() {
		String str = "abcba";
        String str1 = new StringBuilder(str).reverse().toString().intern();
        return str==str1;
	}
}
