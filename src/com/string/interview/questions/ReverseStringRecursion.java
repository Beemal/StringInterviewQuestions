package com.string.interview.questions;

public class ReverseStringRecursion {

	public static void main(String[] args) {
			System.out.println(reverse("lamib"));
			
			//reverse string using String Buffer
			System.out.println(new StringBuffer("lamib").reverse());
	}

	private static String reverse(String string) {
		if(string.length() <= 1)
			return string;			// base case
	
		return reverse(string.substring(1))+string.charAt(0);
	}

}
