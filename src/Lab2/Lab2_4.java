package Lab2;

import java.util.Scanner;

public class Lab2_4 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Santigrat değeri giriniz: ");
		int santigrat = giris.nextInt();
		
		float fahrenheit = santigrat * ((float)9/5) + 32;
		
		System.out.print("Fahrenheit: "+fahrenheit);		
	}

}
