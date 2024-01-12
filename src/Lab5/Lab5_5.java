package Lab5;

import java.util.Scanner;

public class Lab5_5 {

	public static void main(String[] args) {

		
		boolean seasonTrue = false;
		
		String season="a";
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Hangi Aydasınız ?");
		int mounth = inputScanner.nextInt();
		
		switch (mounth){
		case 1: {
			season = "Kış";
			break;
		}
		
		case 2: {
			season = "Kış";
			break;
		}
		
		case 3: {
			season = "İlkbahar";
			break;
		}
		
		case 4: {
			season = "İlkbahar";
			break;
		}
		
		case 5: {
			season = "İlkbahar";
			break;
		}
		
		case 6: {
			season = "Yaz";
			break;
		}
		
		case 7: {
			season = "Yaz";
			break;
		}
		
		case 8: {
			season = "Yaz";
			break;
		}
		
		case 9: {
			season = "Sonbahar";
			break;
		}
		
		case 10: {
			season = "Sonbahar";
			break;
		}
		
		case 11: {
			season = "Sonbahar";
			break;
		}
		default:{
			System.out.println("Doğru gir :) ");
			seasonTrue = true;
		}

	}
		if(!seasonTrue)
		System.out.println("Mevsim : "+season);
}
}
