package Lab2;

import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Yükseklik Giriniz: ");
		int h = giris.nextInt();
		
		System.out.print("Taban Giriniz: ");
		int taban = giris.nextInt();
		
		float alanHesabi = taban * h /(float)2;
		
		System.out.print("Alan Hesabi: "+alanHesabi);
	}

}
