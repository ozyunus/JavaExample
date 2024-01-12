package Lab2;

import java.util.Scanner;

public class Lab2_9 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Vize notunu giriniz: ");
		int vize = giris.nextInt();
		
		System.out.print("Odev notunu giriniz: ");
		int odev = giris.nextInt();
		
		System.out.print("Final");
		int finalNotu = giris.nextInt();
		
		float sinavSonucu = (vize*0.30f)+(odev*0.20f)+(finalNotu*0.50f);
		
		System.out.print("Sınav Sonucu: "+sinavSonucu);		
	}

}
