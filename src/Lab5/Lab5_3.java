package Lab5;

import java.util.Scanner;

public class Lab5_3 {

	public static void main(String[] args) {

		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı rakam giriniz: ");
		int number = inputScanner.nextInt();
		
		switch (number) {
		case 0: {
			System.out.print("Sifir");
			break;
		}
		
		case 1: {
			System.out.print("Bir");
			break;
		}
		
		case 2: {
			System.out.print("İki");
			break;
		}
		
		case 3: {
			System.out.print("Üç");
			break;
		}
		
		case 4: {
			System.out.print("Dört");
			break;
		}
		
		case 5: {
			System.out.print("Beş");
			break;
		}
		
		case 6: {
			System.out.print("Altı");
			break;
		}
		
		case 7: {
			System.out.print("Yedi");
			break;
		}
		
		case 8: {
			System.out.print("Sekiz");
			break;
		}
		
		case 9: {
			System.out.print("Dokuz");
			break;
		}
		
		default:
			System.out.println("0-9 arası değer girmediniz.");
			break;
		}

	}

}
