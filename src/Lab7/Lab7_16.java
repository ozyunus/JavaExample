package Lab7;

import java.util.Scanner;

public class Lab7_16 {

	public static void main(String[] args) {
			
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz: ");
		int num = inputScanner.nextInt();
		
		int sonuc= kareDondur(num);
		System.out.println("Sonuc: "+sonuc);
		
	}
	public static int kareDondur(int num) {
		int numToplam = (num*(num+1)/2);
		int numKare = numToplam*numToplam;
		
		int kareToplam=0;
		for (int i=0; i<=num; i++) {
			kareToplam += i*i;
		}		
		int result = numKare - kareToplam;
		return result;
	}
}
