package Lab3;

import java.util.Scanner;

public class Lab3_26 {

	public static void main(String[] args) {
		int avarageNumber=0;

		Scanner girdi = new Scanner(System.in);
		System.out.print("İlk sayıyı giriniz:");
		int number1 = girdi.nextInt();
		
		System.out.print("İkinci sayıyı giriniz:");
		int number2 = girdi.nextInt();
		
		System.out.print("Üçüncü sayıyı giriniz:");
		int number3 = girdi.nextInt();
		
		if (number1<number2 && number2<number3) {
			avarageNumber = number2;
		}
		
		else if (number2<number1 && number1<number3) {
			avarageNumber = number1;
		}
		else if (number3>number1 && number3<number2) {
			avarageNumber = number3;
		}
		
		System.out.print(avarageNumber);
	}

}
