package com.string.interview.questions;

public class PrintDuplicateCharater {

	public static void main(String[] args) {
		System.out.println(printDups("bimal"));

	}

	private static String printDups(String string) {
		if(string == null || string.length() < 1){
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for(char c: string.toCharArray()){
			sb.append(c);
			sb.append(c);
		}
		return sb.toString();
	}

}
