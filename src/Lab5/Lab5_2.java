package Lab5;

import java.security.Principal;
import java.util.Scanner;

public class Lab5_2 {

	public static void main(String[] args) {

		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir gün giriniz: ");
		int day = inputScanner.nextInt();
		
		switch (day) {
		case 1: {
			System.out.println("Pazartesi Günü");
			break;
		}
		
		case 2: {
			System.out.println("Salı Günü");
			break;
		}
		
		case 3: {
			System.out.println("Çarşamba Günü");
			break;
		}
		
		case 4: {
			System.out.println("Perşembe Günü");
			break;
		}
		
		case 5: {
			System.out.println("Cuma Günü");
			break;
		}
		
		case 6: {
			System.out.println("Cumartesi Günü");
			break;
		}
		
		case 7: {
			System.out.println("Pazar Günü");
			break;
		}
		default:
			System.out.print("Haftanın 7 günü var. Doğru gir ");
			break;
		}

	}

}
