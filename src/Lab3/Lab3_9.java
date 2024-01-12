package Lab3;

import java.util.Scanner;

public class Lab3_9 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Yaşınızı Giriniz: ");
		int years = girdi.nextInt();
		
		if (years >= 18) {
			System.out.print("Oy kullanabilirsiniz!");
		}
		else {
			System.out.print("Yaşınız oy kullanmaya yeterli değil!");
		}
		girdi.close();
	}
}
