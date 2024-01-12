package Lab3;

import java.util.Scanner;

public class Lab3_13 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("İlk kenar uzunluğunu giriniz: ");
		double line1 = girdi.nextDouble();
		
		System.out.print("İkinci kenar uzunluğunu giriniz: ");
		double line2 = girdi.nextDouble();
		
		System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
		double line3 = girdi.nextDouble();
		
		if (line1 == line2 && line1==line3) {
			System.out.print("Eşitkenar Üçgen");
		}
		else if (line1==line2 && line1!=line3 || line1!=line2 && line1==line3) {
			System.out.print("İkizkenar üçgen");
		}
		else {
			System.out.print("Çeşitkenar üçgen");
		}
		girdi.close();

	}

}
