package Lab4;

import java.util.Scanner;

public class Lab4_26 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Lütfen 1.Sayı giriniz: ");
		int number1 = inputScanner.nextInt();
		
		System.out.println("Lütfen 2.Sayı giriniz: ");
		int number2 = inputScanner.nextInt();
		
		int asal=0;
		
		for(int i=number1; i<=number2; number1++) {
			if(number1%i==0) {
				asal=number1;
				System.out.println(asal+" Asal sayıdır!");
				break;
			}
		}
		inputScanner.close();

	}


}
// beraber bi bakalım