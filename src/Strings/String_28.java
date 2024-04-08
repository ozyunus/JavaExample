package Strings;

public class String_28 {

	public static void main(String[] args) {
		String bigWord ="";
		String[] words = {"selam","millet","bu","gün","pazartesi"};

		for (int i=0; i<words.length; i++) {
			if(words[i].length()>bigWord.length()) {
				bigWord = words[i];
			}
		}
		System.out.println("Büyük sayı: "+bigWord);
	}

}
