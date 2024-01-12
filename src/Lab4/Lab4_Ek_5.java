package Lab4;

import java.util.Scanner;

public class Lab4_Ek_5 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int inputNumber = inputScanner.nextInt();
		
		int number1=0;
		int number2=1;
		int number3=0;
		
		for (int i=0; i<=inputNumber; i++) {
			number3 = number1 + number2;
			System.out.println(number3);
			number1 = number2;
			number2 = number3;
		}
		double fark = (double)number3 / number1;
		System.out.println("Son Sayı: "+number3+"\nFark: "+fark);
	}

}
