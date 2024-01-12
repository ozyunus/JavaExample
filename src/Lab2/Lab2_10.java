package Lab2;

import java.util.Scanner;

public class Lab2_10 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Vize notunuzu giriniz: ");
		int vize = giris.nextInt();
		
		System.out.print("ödev notunuzu giriniz: ");
		int odev = giris.nextInt();
		
		double finalNotu = (70-(vize*0.3)-(odev*0.2))*2;
		System.out.print(finalNotu);
		
	}

}
