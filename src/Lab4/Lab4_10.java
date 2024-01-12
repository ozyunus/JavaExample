package Lab4;

import java.util.Scanner;

public class Lab4_10 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Lütfen Sayı giriniz: ");
		int number = inputScanner.nextInt();
		boolean asalmi = true;
		
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				asalmi = false;
				break;
			}
		}
		inputScanner.close();
		if(asalmi==true) {
			System.out.println("Asaldır");
		}
		else {
			System.out.println("Asal değil");
		}
	}
}
