package Strings;

import java.util.Iterator;

public class String_29 {

	public static void main(String[] args) {
		String[] words = {"Bu","gün","günlerden","pazartesi."};
		String temporary ="";
		String newWord="";
		
		for(int i=0; i<words.length; i++) {
			temporary = words[i];
			newWord=newWord.concat(" "+temporary);
		}
		System.out.println(newWord);
	}

}
