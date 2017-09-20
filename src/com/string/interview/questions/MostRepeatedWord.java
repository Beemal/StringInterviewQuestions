package com.string.interview.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedWord {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader br;
		try{
			// creating BufferedReader object
			br = new BufferedReader(new FileReader("file.txt"));
			// file.txt is inside root folder of project
			
			String currentLine = br.readLine();
			//reading the first line
			while(currentLine != null){
				String[] words = currentLine.toLowerCase().split(" ");
				for(String word: words){
					if(!map.containsKey(word)){
						map.put(word, 1);
					}else{
						map.put(word, map.get(word)+1);
					}
				}
				//reading next line into currentLine
				currentLine = br.readLine();
			}
			int min = 0;
			String resultWord = null;
			for(Map.Entry<String, Integer> entry:map.entrySet()){
				if(entry.getValue() > min){
					min = entry.getValue();
					resultWord = entry.getKey();
				}
			}
			System.out.println("MOST Repeated word in the file is - "+resultWord);
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
