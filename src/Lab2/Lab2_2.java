package Lab2;

import java.util.Scanner;

public class Lab2_2 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Sayi 1 i giriniz: ");
		int num1 = giris.nextInt();
		
		System.out.print("Sayi 2 yi giriniz: ");
		int num2 = giris.nextInt();
		
		System.out.print("Sayi 3 ü giriniz: ");
		int num3 = giris.nextInt();
		
		float avarage = ((float)num1 + num2 + num3) / 3;
		System.out.print("Sayıların Ortalaması: " + avarage);
	}

}
