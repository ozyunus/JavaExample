package Strings;

import java.util.Iterator;
import java.util.Spliterator;

public class String_21 {

	public static void main(String[] args) {
		String inputTextString = "hello selam merhaba";
	
		String[] newTextStrings = inputTextString.split(" ");
		
		for(String word:newTextStrings) {
			System.out.println(word);
		}
		
	}

}
