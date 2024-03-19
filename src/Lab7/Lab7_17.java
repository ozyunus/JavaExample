package Lab7;

import java.util.Scanner;

public class Lab7_17 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int num = inputScanner.nextInt();

		int asal = asalGetir(num);
		System.out.println(asal);
	}
	public static int asalGetir(int num) {
		int indeks = 2;
		int count = 0;
		int bolCount = 0;

		while (count < num) {
			for (int i = 2; i <= indeks; i++) {
				if (indeks % i == 0) {
					bolCount++;
				}
				

			}
			if (bolCount==1) {
				count++;

			}
			bolCount=0;
		
			
			indeks++;

		}
		return indeks-1; 
	}
}
