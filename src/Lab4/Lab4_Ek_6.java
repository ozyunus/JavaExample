package Lab4;

import java.util.Scanner;

public class Lab4_Ek_6 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int inputNumber = inputScanner.nextInt();
		
		for (int i =0; i<=inputNumber; i++) {
			for (int j =2; j<=i*2; j+=2){
				System.out.print(j+ " ");
			}
			System.out.println();

		}
	}

}
