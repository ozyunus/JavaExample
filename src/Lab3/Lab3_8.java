package Lab3;

import java.util.Scanner;

public class Lab3_8 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		double number = girdi.nextDouble();
		
		if (number>0) {
			System.out.print("Sayı Pozitiftir!");
		}
		else if (number==0){
			System.out.print("Sayı Sıfıra Eşittir!");
		}
		else {
			System.out.print("Sayı Negatiftir !");
		}
		girdi.close();
	}
}
