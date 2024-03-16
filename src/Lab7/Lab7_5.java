package Lab7;

import java.util.Scanner;

public class Lab7_5 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int num = inputScanner.nextInt();
		
		faktoriyelHesapla(num);
		inputScanner.close();
	}
	
	public static void faktoriyelHesapla(int number) {
		int result=1;
		
		for ( int i = number; i>0; i--) {
			result *= i;
		}
		System.out.println("Sonuc: "+result);
	}
	

}
