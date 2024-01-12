package Lab3;

import java.util.Scanner;

public class Lab3_20 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Harf notunuzu giriniz: ");
		String harf = girdi.next();
		
		if (harf.equals("A")) {
			System.out.print("Çok iyi");
		}
		else if (harf.equals("B")) {
			System.out.print("İyi");
		}
		else if (harf.equals("C")) {
			System.out.print("Orta");
		}
		else if (harf.equals("D")) {
			System.out.print("Kötü");
		}
		else if (harf.equals("E")) {
			System.out.print("Çok Kötü");
		}
		else {
			System.out.print("Lütfen A, B, C, D, E, F notlarından birini giriniz.");
		}
	}

}
