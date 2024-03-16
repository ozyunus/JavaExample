package Lab7;

import java.util.Scanner;

public class Lab7_1 {

	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("1.sayıyı giriniz: ");
		int number1 = inputScanner.nextInt();
		
		System.out.println("2.sayıyı giriniz: ");
		int number2 = inputScanner.nextInt();
		
		System.out.println("3.sayıyı giriniz: ");
		int number3 = inputScanner.nextInt();
		
		avarage(number1, number2, number3);
		
		inputScanner.close();

}
	public static void avarage(int num1, int num2, int num3) {
		int total = num1+num2+num3;
		double avarage = total /3;
		
		System.out.println("Ortalama: "+avarage);
		
	}
}
