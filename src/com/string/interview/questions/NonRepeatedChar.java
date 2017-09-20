package com.string.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChar {

	public static void main(String[] args) {
		System.out.println(firstnonRepeatedChar("bimal"));
		System.out.println(firstnonRepeatedChar("bbial"));
		System.out.println(firstnonRepeatedChar("baba"));
		System.out.println(firstnonRepeatedChar("m"));
	}

	private static char firstnonRepeatedChar(String string) {
		char notFound = 0;
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<string.length(); i++){
			if(!map.containsKey(string.charAt(i))){
				map.put(string.charAt(i), 1);
			}else{
				map.put(string.charAt(i), map.get((string).charAt(i)) +1);
			}
		}
		for(int i=0; i<string.length(); i++){
			if(map.get(string.charAt(i)) == 1)
				return string.charAt(i);
		}
		return notFound;
	}

}
