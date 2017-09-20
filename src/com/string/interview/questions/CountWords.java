package com.string.interview.questions;

public class CountWords {

	public static void main(String[] args) {
		System.out.println(numberOfWords("My name is Bimal Parajuli"));

	}

	private static int numberOfWords(String string) {
		int count = 0;
		for(String s:string.split(" "))
			count++;

		return count;
	}

}
