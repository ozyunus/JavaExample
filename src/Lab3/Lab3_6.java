package Lab3;

import java.util.Scanner;

public class Lab3_6 {

	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("ilk tam sayıyı giriniz: ");
		int number1 = girdi.nextInt();
		
		System.out.print("İkinci tam sayıyı giriniz: ");
		int number2 = girdi.nextInt();
		
		if (number1 == number2) {
			System.out.print("Sayılar Eşit! ");
		}
		else {
			System.out.print("Sayılar Eşit Değil! ");
		}
		girdi.close();
	}
	

}
