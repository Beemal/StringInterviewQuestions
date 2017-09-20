package com.string.interview.questions;

public class OccurenceChar {
// count the occurance of char without loop
	public static void main(String[] args) {
		System.out.println(NumberOfOccur("bimalparajuli",'a'));
		System.out.println(NumberOfOccur("mango",'a'));
	}
	
	private static int NumberOfOccur(String string, char c) {
//		int counter = string.split(""+c,-1).length - 1;
		
/*		The limit parameter controls the number of times the pattern 
		is applied and therefore affects the length of the resulting 
		array. If the limit n is greater than zero then the pattern 
		will be applied at most n - 1 times, the array's length will 
		be no greater than n, and the array's last entry will 
		contain all input beyond the last matched delimiter. 
		If n is non-positive then the pattern will be applied as many 
		times as possible and the array can have any length. 
		If n is zero then the pattern will be applied as 
		many times as possible, the array can have any length, 
		and trailing empty strings will be discarded.   */
		
		int counter = string.length() - string.replaceAll(""+c, "").length();
		return counter;
	}

}
