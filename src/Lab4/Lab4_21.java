package Lab4;

import java.util.Scanner;

public class Lab4_21 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int number = inputScanner.nextInt();
		
		int number1=0;
		int number2=1;
		int number3=0;
		System.out.println(number1);
		System.out.println(number2);
		for (int i=3; i<=number; i++) {
			number3 = number1+number2;
			System.out.println(number3);
			number1 = number2;
			number2 = number3;
			
		}
		inputScanner.close();
	}

}
