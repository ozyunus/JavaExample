package Lab2;

import java.util.Scanner;

public class Lab2_5 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("ilk hızı giriniz: ");
		int v1= giris.nextInt();
		
		System.out.print("son hızı giriniz: ");
		int v2= giris.nextInt();
		
		System.out.print("Süre: ");
		int time = giris.nextInt();
		
		float ivme = ((float)v2 - v1)/time;
		
		System.out.print("İvme: "+ivme);
	}

}
