package Lab4;

import java.util.Scanner;


public class Lab4_12 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int number = inputScanner.nextInt();
		
		int total=0;
		int tempNum = number;
		
		while(tempNum !=0) {
			total += tempNum %10;
			tempNum /=10;
		}
		System.out.println(number+" sayısının rakamları toplamı: "+total);
		inputScanner.close();
	}

}
