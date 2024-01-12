package Lab3;

import java.util.Scanner;

public class Lab3_14 {

	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("Sıcaklık Değerini giriniz: ");
		double degree = girdi.nextDouble();
		
		if (degree <=0) {
			System.out.print("Dondurucu");
		}
		else if(degree <= 10) {
			System.out.print("Çok Soğuk!");
		}
		else if(degree <= 20) {
			System.out.print("Soğuk");
		}
		else if(degree <=30) {
			System.out.print("Normal");
		}
		else if(degree <40) {
			System.out.print("Sıcak");
		}
		else {
			System.out.print("Çok Sıcak!");
		}

	}

}
