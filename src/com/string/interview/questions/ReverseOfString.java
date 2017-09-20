package com.string.interview.questions;

public class ReverseOfString {

	public static void main(String[] args) {
		System.out.println(reverse("madam"));
		System.out.println(reverse("under"));
	}
		
	private static String reverse(String string) {
		String reverse = "";
		for(int i = string.length()-1; i >=0; i--){
			reverse += string.charAt(i);
		}
		return reverse;
	}

}
