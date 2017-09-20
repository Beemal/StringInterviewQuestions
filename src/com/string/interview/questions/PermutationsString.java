package com.string.interview.questions;

public class PermutationsString {

	public static void main(String[] args) {
		permutation("ABC");
		permutation("ABCD");
		permutation("AB");

	}

	private static void permutation(String string) {
		char[] array = string.toCharArray();
		char temp;
		for(int i = 0; i < string.length(); i++){
			for(int j = 0; j<string.length(); j++){
				if(i!=j){
					//swap i & j index
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					System.out.println(String.valueOf(array));
				}
			}
		}
		System.out.println("-------------------------");
	}

}
