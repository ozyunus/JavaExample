package Lab3;

import java.util.Scanner;

public class Lab3_10 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.print("Lütfen bir tam sayı giriniz: ");
		int numbers = girdi.nextInt();
		
		if (numbers > 0) {
			System.out.print("1");
		}
		else if (numbers < 0) {
			System.out.print("-1");
		}
		else {
			System.out.print("0");
		}
		girdi.close();
	}

}

// tam sayı mı nasıl anlarım ?
