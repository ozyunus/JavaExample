package Lab3;

import java.util.Scanner;

public class Lab3_7 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Lütfen 1 tam sayıyı giriniz: ");
		int number = girdi.nextInt();
		
		
		if (number % 2==0) {
			System.out.println("Sayı Çift!");
		}
		else {
			System.out.print("Sayı Tek!");
		}
		girdi.close();
	}

}
