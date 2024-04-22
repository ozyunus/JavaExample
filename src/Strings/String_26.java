package Strings;

public class String_26 {

	public static void main(String[] args) {
		String[] words = {"ekmek","aş","sllu","yoldaş"};
		String word = "su";
		int count=0;
		
		for (int i=0; i<words.length; i++) {
			if(words[i]==word) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(word+" kelimesi dizide de vardır.");
		}
		else {
			System.out.println(word+" kelimesi dizide yoktur.");
		}

	}

}
