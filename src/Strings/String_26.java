package Strings;

public class String_26 {

	public static void main(String[] args) {
		String[] words = {"ekmek","aş","su","yoldaş"};
		String word = "su";
		
		for (int i=0; i<words.length; i++) {
			if(words[i]==word) {
				System.out.println(word+" kelimesi dizide de vardır.");
			}
		}

	}

}
