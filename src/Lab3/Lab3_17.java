package Lab3;

import java.util.Scanner;

public class Lab3_17 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Ürün maliyetini giriniz: ");
		double maliyet = girdi.nextDouble();
		
		System.out.print("Ürün satış fiyatnı giriniz: ");
		double satisFiyati = girdi.nextDouble();
		
		double yuzde = ((satisFiyati-maliyet)/maliyet)*100;
		
		if (satisFiyati < maliyet) {
			System.out.print("Zarar: % "+yuzde);
		}
		else {
			System.out.print("Kar: % "+yuzde);
		}
		girdi.close();
	}
}
