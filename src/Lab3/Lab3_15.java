package Lab3;

import java.util.Scanner;

public class Lab3_15 {

	public static void main(String[] args) {

		Scanner girdi = new Scanner(System.in);
		System.out.print("İlk açı değerini giriniz: ");
		double degree1 = girdi.nextDouble();
		
		System.out.print("İkinci açı değerini giriniz: ");
		double degree2 = girdi.nextDouble();
		
		System.out.print("Üçüncü açı değerini giriniz: ");
		double degree3 = girdi.nextDouble();
		
		if (degree1 > 0 && degree2 > 0 && degree3 > 0) {
			double degree = degree1 + degree2 + degree3;
			if (degree!=180) {
				System.out.print("İç açılar toplamı 180 olmalıdır");
			}
			else {
				System.out.print("Üçgen oluşturabilir.");
			}
		}
		girdi.close();
	}

}
