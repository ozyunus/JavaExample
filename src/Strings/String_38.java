package Strings;

public class String_38 {

	public static void main(String[] args) {
		String word = "welcome";
		String newWord="";
		
		for(int i=0; i<word.length(); i++) {
			newWord += word.charAt(i);
			newWord += word.charAt(i);
		}
		System.out.println(newWord);
	}

}
