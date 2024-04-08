package Strings;

import java.util.Spliterator;

public class String_23 {

	public static void main(String[] args) {
		String str = "bugün hava ne güzelmiş";
		String[] words = str.split(" ");
		String bigWord="";
		
		for(String word: words) {
			for(int i=0; i<word.length(); i++) {
				if(word.length()>bigWord.length()) {
					bigWord = word;
				}
			}

		}
		System.out.println("En büyük yazı: "+bigWord);

	}

}
