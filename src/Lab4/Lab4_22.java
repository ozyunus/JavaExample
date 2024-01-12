package Lab4;

import java.util.Scanner;

public class Lab4_22 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int number= inputScanner.nextInt();
		int payda=0;
		double total =0.f;
		
		for (int i=1; i<=number; i++) {
			payda =i;
			System.out.println("1/"+i);
			total += (double)1/payda;
		}
		System.out.println("Toplam: "+total);
		inputScanner.close();
	}
	
}
