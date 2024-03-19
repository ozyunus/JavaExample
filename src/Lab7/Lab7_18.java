package Lab7;

import java.security.PublicKey;
import java.util.Scanner;

public class Lab7_18 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int num = inputScanner.nextInt();
		
		fibonacciListele(num);
		inputScanner.close();
	}
	public static void fibonacciListele(int num) {
		int total=0;
		int firstValue=1;
		int secondValue=1;
		
		for (int i=0; i<num; i++) {
			secondValue=total;
			  total +=firstValue;
			  
			System.out.println(total);
			firstValue=secondValue;
		}
	}
}