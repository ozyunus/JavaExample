package Strings;

public class String_35 {

	public static void main(String[] args) {
		String word = "Sel6ma7gt0";
		int count=0;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==('1')) {
				count++;
			}
			else if(word.charAt(i)==('2')) {
				count++;
			}
			else if(word.charAt(i)==('3')) {
				count++;
			}
			else if(word.charAt(i)==('4')) {
				count++;
			}
			else if(word.charAt(i)==('5')) {
				count++;
			}
			else if(word.charAt(i)==('6')) {
				count++;
			}
			else if(word.charAt(i)==('7')) {
				count++;
			}
			else if(word.charAt(i)==('8')) {
				count++;
			}
			else if(word.charAt(i)==('9')) {
				count++;
			}
			else if(word.charAt(i)==('0')) {
				count++;
			}
		
			
		}
		System.out.println(word+" içerisinde "+count+" adet rakam vardır.");
	}

}
