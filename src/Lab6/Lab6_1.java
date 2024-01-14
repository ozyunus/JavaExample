package Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_1 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		int[] number = new int[10];
		
		for (int i = 0; i<10; i++) {
			System.out.println("Sayı Giriniz: ");
			int number2  = inputScanner.nextInt();
			number[i]= number2;
		}
		System.out.println("\nDizi içeriği: ");
		System.out.println(Arrays.toString(number));
		inputScanner.close();
	}

}
