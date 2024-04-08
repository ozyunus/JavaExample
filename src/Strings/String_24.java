package Strings;

public class String_24 {

	public static void main(String[] args) {
		int count=0;
		String word = "selametle";
		char harf = 'e';
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==harf) {
				count++;
			}
		}
			System.out.println(harf+" metinde "+count+" kez geçmiştir.");
	}

}
