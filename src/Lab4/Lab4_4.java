package Lab4;

import java.util.Scanner;

public class Lab4_4 {

	public static void main(String[] args) {
		int total = 0;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Lütfen Bir sayı Giriniz: ");
		int tamSayi = inputScanner.nextInt();

		for (int i = 1; i <= tamSayi; i++) {
			System.out.print(i + " ");
			total += i;
		}
		System.out.print("\nToplam: " + total);
		inputScanner.close();
	}
	
}
