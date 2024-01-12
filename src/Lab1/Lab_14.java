package Lab1;

import java.util.Scanner;

public class Lab_14 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Dolar Miktarını Giriniz: ");
		float dolarMiktari = giris.nextFloat();
		
		System.out.print("Dolar Kurunu Giriniz: ");
		float dolarKuru = giris.nextFloat();
		
		float sonuc= dolarMiktari * dolarKuru;
		System.out.print("Paranızın Tl Karşılığı: "+sonuc);
		giris.close();
	}

}
