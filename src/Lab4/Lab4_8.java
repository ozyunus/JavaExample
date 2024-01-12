package Lab4;

import java.util.Scanner;

public class Lab4_8 {

	public static void main(String[] args) {
		int toplam=0;
		double avarage=0;
		Scanner inputScanner = new Scanner(System.in);

		for(int i=0; i<20; i++) {
			System.out.println("Sayı Giriniz: ");
			int sayi = inputScanner.nextInt();
			toplam +=sayi;
		}
		avarage= toplam/3.f;
		
		System.out.println("Ortalama: "+avarage);
		System.out.println("Toplam: "+toplam);
		
	}

}
