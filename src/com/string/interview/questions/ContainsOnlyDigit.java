package com.string.interview.questions;

public class ContainsOnlyDigit {
	// check if string contains only digits
	public static void main(String[] args) {
		onlyDigit("abc123");
		onlyDigit("123");
	}

	@SuppressWarnings("finally")
	private static void onlyDigit(String string) {
		int result = 0;
		try{
			result = Integer.parseInt(string);
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		finally{
			if(result != 0)
				System.out.println(result);
			else
				System.out.println("This string is not pure digit");
		}
	}

}
