package Lab3;

import java.util.Scanner;

public class Lab3_27 {

	public static void main(String[] args) {
		double sonuc=0;
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("Fahrenheit’dan Celsius’a çevirmek için F giriniz.\n"
				+ "Celsius’dan Fahrenheit’a çevirmek için C giriniz.\n");
		String choise = girdi.next();
		
		System.out.print("Dereceyi giriniz: ");
		double degree = girdi.nextDouble();
		
		if (choise.equals("C")) {
			sonuc = (degree * 9 / 5)+ 32;
		}
		else if (choise.equals("F")) {
     		sonuc = (degree - 32) * 5 / 9;
		}
		
		System.out.print(sonuc);
		
	}

}
