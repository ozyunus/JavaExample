package Lab2;

import java.util.Scanner;

public class Lab2_11 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Boy: ");
		double boy = giris.nextDouble();
		
		System.out.print("Kilo: ");
		int kg = giris.nextInt();
		
		double vki = kg/(boy*boy);
		
		System.out.print("Vücut kitle indeksiniz: "+vki);
			
		
	}

}
