package Lab4;

import java.util.Scanner;

public class Lab4_20 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int number = inputScanner.nextInt();
		
		for (int i=1; i<=number; i++) {
			int result = number*i;
			System.out.println(number+" x "+i+" = "+result);
		}
		inputScanner.close();
	}
}
