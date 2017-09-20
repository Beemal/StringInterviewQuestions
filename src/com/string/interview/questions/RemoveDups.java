package com.string.interview.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDups {

	public static void main(String[] args) {
		removeDups("apple");
		removeDupsInOrder("apple");
		removeDups2("apple");
	}

	//simple example 
	private static void removeDups2(String string) {
		String result = "";
		for(char c: string.toCharArray()){
			if(!result.contains(String.valueOf(c))){
				result+=c;
			}
		}
		System.out.println(result);
	}

	private static void removeDupsInOrder(String string) {
		char[] array = string.toCharArray();
		StringBuffer sb = new StringBuffer();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Arrays.sort(array);
		System.out.println(String.valueOf(array));
		for(char c:array){
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else{
				map.put(c, map.get(c)+1);
			}
		}
		boolean dups = false;
		for(char c:array){
			if(map.get(c) == 1){
				sb.append(c);
				dups = false;
			}else if(map.get(c) > 1 && (!dups)){
				sb.append(c);
				dups = true;
			}
		}
		System.out.println(sb.toString());
	}



	private static void removeDups(String string) {
		Set<Character> set = new TreeSet<>();
		for(char c: string.toCharArray()){
			set.add(c);
		}
		
		Iterator<Character> it = set.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println("--------------");
	}

}
