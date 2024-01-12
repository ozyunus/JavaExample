package Lab4;

import java.util.Scanner;

public class Lab4_5 {

	public static void main(String[] args) {
		int kup = 1;
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz: ");
		int number = inputScanner.nextInt();

		for (int i = 1; i <= number; i++) {
			kup = i * i * i;
			System.out.println(i + " sayısının küpü = " + kup);
		}
		inputScanner.close();
	}
}
