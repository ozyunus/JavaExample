package Lab4;

import java.util.Scanner;

public class Lab4_6 {

	public static void main(String[] args) {
		int total=0;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Lütfen ilk sayıyı giriniz: ");
		int num1 = inputScanner.nextInt();
		
		System.out.print("Lütfen ikinci sayıyı giriniz: ");
		int num2 = inputScanner.nextInt();
		
		for(int i= num1; i<=num2; i++) {
			total += i;
		}
		System.out.print("Toplam: "+total);
		inputScanner.close();
	}
}
