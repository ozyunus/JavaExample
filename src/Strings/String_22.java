package Strings;

public class String_22 {

	public static void main(String[] args) {
		String str = "Bugün hava çok güzel!"; 
		String[] words = str.split(" ");
		
		for(String word: words) {
			for (int i=0; i<word.length(); i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
