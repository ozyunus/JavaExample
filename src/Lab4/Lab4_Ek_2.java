package Lab4;

import java.util.Scanner;

public class Lab4_Ek_2 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int newNumber =0;
		int lastNumber =0;
		int lowNumberCount =0;
		int totalNumber =0;
		
		while (lowNumberCount!=3) {
			System.out.println("Sayı giriniz: ");
			newNumber = inputScanner.nextInt();
			
			if (lastNumber<newNumber) {
			  
			  lowNumberCount=0;
			}
			else {
				lowNumberCount++;
			}
			totalNumber+=newNumber;
			lastNumber = newNumber;
		}
		System.out.println("Toplam: "+totalNumber);

	}

}
