package model;

import java.util.*;

public class Order {

	public static String order(String wordsString) {

		String[] wordsArray = wordsString.split("\\s");

		String[] sortedWords = new String[wordsArray.length];

		for (String word : wordsArray) {
			
			//resource leak???
			
			if (word == null) return "";
			
			Scanner scan = new Scanner(word);
			
			if (scan.useDelimiter("\\D+").hasNext()) {
								
				int res = scan.useDelimiter("\\D+").nextInt();

				sortedWords[res - 1] = word;
				
			} else {
				
				scan.close();				
				return "";
			}
			
			scan.close();

		}

		return String.join(" ", sortedWords);

	}

}
