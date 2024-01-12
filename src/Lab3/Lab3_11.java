package Lab3;

import java.util.Scanner;

public class Lab3_11 {

	public static void main(String[] args) {
		int juniorNumber;

		Scanner girdi = new Scanner(System.in);
		System.out.print("İlk sayıyı giriniz: ");
		int number1 = girdi.nextInt();
		
		System.out.print("İkinci sayıyı giriniz: ");
		int number2 = girdi.nextInt();
		
		if (number1<number2) {
			juniorNumber = number1;
		}
		else {
			juniorNumber = number2;
		}
		System.out.print("Küçük Sayı: "+ juniorNumber);
		girdi.close();
	}
}
