package Lab1;

import java.util.Scanner;

public class Lab1_12 {
	public static void main(String[] args) {
		float Pi= 3.14159f;
		float r;
		float Environment;
		float Area;
		
		Scanner yariCap= new Scanner(System.in);
		System.out.print("Yarı Çap değerini giriniz: ");
		r = yariCap.nextFloat();
		
		Environment = 2 * Pi * r;
		Area = Pi * (r*r);
		
		System.out.println("Dairenin Çevresi: "+Environment);
		System.out.print("Dairenin Alanı: "+Area);	
	}
}
