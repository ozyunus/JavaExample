package Lab4;

import java.util.Scanner;

public class Lab4_15 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Lütfen taban değeri giriniz:");
		int taban = inputScanner.nextInt();
		
		System.out.println("Lütfen üs değeri giriniz:");
		int usSayi = inputScanner.nextInt();
		
		int result = 1;
		
		for (int i=1; i<=usSayi; i++) {
			result = result*taban;
		}
			System.out.println(result);
			inputScanner.close();
	}
	

}
