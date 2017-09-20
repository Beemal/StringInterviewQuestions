package com.string.interview.questions;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		System.out.println(checkAnagram("bimal","mailb"));
		
		int a[] = {1,2,3};
		int b[] = {1,2,3};
		Object[] o1 = {a};
		Object[] o2 = {b};
		System.out.println(Arrays.deepEquals(o1, o2));

	}

	private static boolean checkAnagram(String string1, String string2) {
		char[] array1 = string1.toCharArray();
		char[] array2 = string2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
	
		if(Arrays.equals(array1, array2))
			return true;
		else
			return false;
	}

}
