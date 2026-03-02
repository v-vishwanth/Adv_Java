package com.collections;

public class Regex {
	public static void main(String[] args) {
		String str = "jhg";
		System.out.println(str.matches("^[a-zA-Z]+$"));  //ONLY LETTERS
		
		
		String str1 = "123";
		System.out.println(str1.matches("^[0-9]+$"));   //ONLY DIGITS
				// OR
		System.out.println(str1.matches("^[\\d]+$"));    //ONLY DIGITS
		
		
		String str2 = "jhg123";
		System.out.println(str2.matches("^[a-zA-Z0-9]+$"));  //BOTH LETTERS AND DIGITS
		
		
		String str3 = ".$%^@";
		System.out.println(str3.matches("^[^a-zA-Z0-9]+$"));  //SPECIAL CHARACTERS ONLY AND INCLUDES WHITESPACE
		
		
		String str4 = " .$%^@";  //includes whitespace as well
		System.out.println(str4.matches("^[^a-zA-Z0-9\\s]+$"));  //SPECIAL CHARACTERS ONLY AND NO WHITESPACE
		
		
		String str5	= " ";
		System.out.println(str5.matches("^ +$"));  //ONLY WHITESPACE
					// OR
		System.out.println(str5.matches("^[\\s]+$"));
	}
}
