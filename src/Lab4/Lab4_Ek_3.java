package Lab4;

import java.util.Scanner;

public class Lab4_Ek_3 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Kaç adet negatif sayı gireceksiniz? ");
		int inpNumber= inputScanner.nextInt();
		int negativeNumberCount=0;
		int totalNumber=0;
		
		while (negativeNumberCount<inpNumber) {
			System.out.println("Bir negatif sayı giriniz: ");
			int newNumber= inputScanner.nextInt();
			
			if (newNumber<0) {
				totalNumber += newNumber;
				negativeNumberCount++;
				
			}
			else {
				negativeNumberCount=0;
				inpNumber = newNumber;
			}
		}
		System.out.println(negativeNumberCount+" adet negatif sayı girildi."+"\nToplam = "+totalNumber);
				
	}

}
