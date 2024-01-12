package Lab3;

import java.util.Scanner;

public class Lab3_24 {

	public static void main(String[] args) {
		
		double sonuc=0;
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("1: Toplama\t2: Çıkarma\t3: Bölme\t4: Çarpma\t5: Mod Alma\n");
		System.out.print("İşlemi giriniz: ");
		int choise = girdi.nextInt();
		
		System.out.print("İlk sayıyı giriniz: ");
		int number1 = girdi.nextInt();
		
		System.out.print("İkinci sayıyı giriniz: ");
		int number2 = girdi.nextInt();
		
		if (choise == 1) {
		    sonuc = number1 + number2;
		}
		else if (choise == 2) {
			sonuc = number1 - number2;
		}
		
		else if (choise == 3) {
			sonuc = number1 / number2;
		}
		
		else if (choise == 4) {
			sonuc = number1 * number2;
		}
		
		else if (choise == 5) {
			sonuc = number1 % number2;
		}
		else {
			System.out.print("Geçersiz seçim");
		}
		System.out.print(sonuc);
	}

}
