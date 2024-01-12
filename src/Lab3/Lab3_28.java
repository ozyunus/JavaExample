package Lab3;

import java.util.Scanner;

public class Lab3_28 {

	public static void main(String[] args) {
		double calculate = 0;
		double pi = 3.1514;

		Scanner girdi = new Scanner(System.in);
		System.out.print("Alanını hesaplatmak istediğiniz şekli seçiniz:\n"
				+ "1- Dikdortgen\n"
				+ "2- Ucgen\n"
				+ "3- Daire\n");
		int choise = girdi.nextInt();
		
		if (choise ==1) {
			System.out.print("Uzun Kenarı giriniz: ");
			int longline = girdi.nextInt();
			
			System.out.print("Kısa kenarı giriniz: ");
			int shortline = girdi.nextInt();
			
		    calculate = longline * shortline;
		}
		
		else if (choise == 2) {
			System.out.print("Tabanı giriniz: ");
			int taban = girdi.nextInt();
			
			System.out.print("Yuksekliği giriniz: ");
			int yukseklik = girdi.nextInt();
			
 			calculate = taban * yukseklik /2;
		}
		
		else {
			System.out.print("Yarı çapı giriniz: ");
			double yaricap = girdi.nextDouble();
			
			calculate = pi*(yaricap*yaricap);
		}
		System.out.print(calculate);
	}

}
