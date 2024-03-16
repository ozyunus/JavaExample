package Lab7;

import java.util.Scanner;

public class Lab7_2 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Taban'ı giriniz: ");
		int taban = inputScanner.nextInt();
		
		System.out.println("Üs'ü giriniz: ");
		int us = inputScanner.nextInt();
		
		usluSayi(taban, us);
		inputScanner.close();
	}
	
	public static void usluSayi(int taban, int us) {
		int toplam=taban;
		for (int i=1; i<us; i++) {
			toplam *=taban;
		}
		System.out.println("toplam: "+toplam);
	}
}
