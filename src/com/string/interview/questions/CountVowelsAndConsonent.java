package com.string.interview.questions;

public class CountVowelsAndConsonent {

	public static void main(String[] args) {
		count("bimalparajuli");
		count("aeroplane");
	}

	private static void count(String string) {
		int vowel = 0, consonant = 0;
		for (char c : string.toCharArray()) {
			if(c == 'a'|| c == 'e'|| c == 'i'|| c == 'o'|| c == 'u')
				vowel++;
			else
				consonant++;
		}
		System.out.println("Number of Vowels in "+ string+" = "+vowel);
		System.out.println("Number of Consonants in "+ string+" = "+consonant);
		System.out.println("--------------------------------");
	}

}
