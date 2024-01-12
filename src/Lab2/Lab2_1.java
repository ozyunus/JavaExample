package Lab2;

import java.util.Scanner;

public class Lab2_1 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Birinci Sayıyı Giriniz: ");
		int Num1 = giris.nextInt();
		
		System.out.print("İkinci Sayıyı Giriniz: ");
		int Num2 = giris.nextInt();
		
		int Toplam = Num1 + Num2;
		int Fark = Num1 - Num2;
		float Bolum = (float) Num1 / Num2;
		int Carpim = Num1 * Num2;
		int Mod = Num1 % Num2;
		
		System.out.print(Toplam+"\n"+Fark+"\n"+Bolum+"\n"+Carpim+"\n"+Mod);
				
	}

	
}
