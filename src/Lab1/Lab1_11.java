package Lab1;

import java.util.Scanner;

public class Lab1_11 {

	public static void main(String[] args) {
		
		float environment;
		float area;
		
		Scanner yukseklikGirdi = new Scanner(System.in);
		System.out.print("Yüksekliğik değerini giriniz: ");
		float height = yukseklikGirdi.nextFloat();
		
		Scanner genislikGirdi = new Scanner(System.in);
		System.out.print("Genişlik değerini giriniz: ");
		float weight = genislikGirdi.nextFloat();
		
		environment = 2 *(weight+height);
		area = weight * height;
		
		System.out.println("Dikdörtgenin Çevresi: "+environment);
		System.out.print("Dikdörtgenin Alanı: "+area );
	}

}
