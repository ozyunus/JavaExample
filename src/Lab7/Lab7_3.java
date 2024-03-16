package Lab7;

import java.util.Scanner;

public class Lab7_3 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("1.sayıyı giriniz: ");
		double number1 = inputScanner.nextDouble();
		
		System.out.println("2.sayıyı giriniz: ");
		double number2 = inputScanner.nextDouble();
		
		System.out.println("3.sayıyı giriniz: ");
		double number3 = inputScanner.nextDouble();
		
		minimumDeger(number1, number2, number3);
	}
	
	public static void minimumDeger(double num1, double num2, double num3) {
		double min = 0f;
		
		if(num1<num2) {
			min = num1;
		}
		else if(num2<num1){
			min = num2;
		}
		
		else if(num3<min){
			min=num3;
		}
		else {
			System.out.println("Sayılar Eşit!");
		}
		System.out.println("Minimum Sayı: "+min);
		
	}

}
