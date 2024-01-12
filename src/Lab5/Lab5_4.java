package Lab5;

import java.util.Scanner;

public class Lab5_4 {

	public static void main(String[] args) {
		String cokiyi = "A";
		String iyi = "B";
		String orta = "C";
		String kotu = "D";
		String cokKotu = "E";

		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Notunuzun harfini giriniz: ");
		String characterString = inputScanner.next();
		characterString = characterString.toUpperCase();
		
		switch (characterString) {
		case "A": {
			System.out.println("Çok İyi");
			break;
		}
		
		case "B": {
			System.out.println("İyi");
			break;
		}
		
		case "C": {
			System.out.println("Orta");
			break;
		}
		
		case "D": {
			System.out.println("Kötü");
			break;
		}
		
		case "E": {
			System.out.println("Çok Kötü");
			break;
		}
		default:
			 System.out.println("Puan epey kötü herhalde :) ");
		}
	}

}
