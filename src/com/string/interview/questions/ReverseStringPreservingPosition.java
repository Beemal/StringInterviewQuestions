package com.string.interview.questions;

public class ReverseStringPreservingPosition {
	// reverse and maintain the position of space
	public static void main(String[] args) {
		System.out.println(reverseString("yM eman si lamib ilujarap"));
	}

	private static String reverseString(String str) {
		String result = "";
		for(String string: str.split(" ")){
		if(string.length() <= 1)
			return result+" "+str.charAt(0);
			result+=reverseString(string.substring(1))+string.charAt(0);
		}
		return result;
	}
}
