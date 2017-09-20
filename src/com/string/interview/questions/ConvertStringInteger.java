package com.string.interview.questions;

public class ConvertStringInteger {

	public static void main(String[] args) {
		System.out.println(convertToInteger("123"));
		System.out.println(convertToString(456));
		System.out.println(convert("100"));
		System.out.println(convert(200));

	}

	private static Object convert(Object obj) {
		Object result = null;
		if(obj instanceof String){
			result = convertToInteger((String) obj);
		}else if(obj instanceof Integer){
			result = ""+obj;
		}
		return result;
	}

	private static String convertToString(int i) {
		String result = ""+i;
		return result;
	}

	private static int convertToInteger(String string) {
		int value = 0;
		try {
			value = Integer.parseInt(string);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		return value;
	}

}
