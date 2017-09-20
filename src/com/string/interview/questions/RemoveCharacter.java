package com.string.interview.questions;

public class RemoveCharacter {

	public static void main(String[] args) {
		remove("bimalk",'k');
		remove("mango",'a');
	}

	private static void remove(String string, char c) {
		String result = null;
		for(char ch : string.toCharArray()){
			if(ch == c){
				 result = string.replace(ch, '\u0000'); 
				 // replace target char with empty /null
			}
		}
		System.out.println(result);
	}

}
