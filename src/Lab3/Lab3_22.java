package Lab3;

import java.util.Scanner;

public class Lab3_22 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Rakam giriniz:");
		int rakam = girdi.nextInt();
		
		switch (rakam) {
		case 1:
			System.out.print("Bir");
			break;
			
		case 2: 
			System.out.print("İki");
			break;
			
		case 3:
			System.out.print("Üç");
			break;
			
		case 4:
			System.out.print("Dört");
			break;
			
		case 5:
			System.out.print("Beş");
			break;
			
		case 6: 
			System.out.print("Altı");
			break;
			
		case 7:
			System.out.print("Yedi");
			break;
			
		case 8:
			System.out.print("Sekiz");
			break;
			
		case 9:
			System.out.print("Dokuz");
			break;
			
		default:
			System.out.print("Rakam girmediniz ");
			break;
		}

	}

}
