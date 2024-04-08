package Strings;

import javax.sound.midi.Soundbank;

public class String30 {

	public static void main(String[] args) {
		char newWord=' ';
		String word1 = "insan";
		String word2 = "hayat";
		
		for(int i=0; i<word1.length(); i++) {
			newWord= word1.charAt(i);
			int donen = (word2.indexOf(newWord));
			if (donen>0) {
				System.out.println("İndeksi :"+i);
				System.out.println(newWord);
			}

		}

		
	}

}
