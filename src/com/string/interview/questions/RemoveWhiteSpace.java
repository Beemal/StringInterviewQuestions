package com.string.interview.questions;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		System.out.println(removeWhiteSpace("My name is bimal parajuli"));
	}

	private static String removeWhiteSpace(String string) {
		String result = string.replaceAll(" ","");
		return result;
	}

}
