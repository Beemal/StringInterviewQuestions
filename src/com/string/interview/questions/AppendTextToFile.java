package com.string.interview.questions;

import java.io.FileWriter;
import java.io.IOException;

public class AppendTextToFile {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("file.txt",true);
			// true will append text to file rather creating a new one
			fw.write("This is text append to a file\n repeat repeat repeat repeatrepeat repeat \nß"); 
			// it will append string to a file.txt
			System.out.println("Above text append to file.txt");
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
