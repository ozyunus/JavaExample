package Lab5;

import java.util.Scanner;

public class Lab5_8 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int total =0;
		
		for (int i=0; i<10; i++) {
			System.out.println("Bir Sayı giriniz: ");
			int number = inputScanner.nextInt();
			if (number<0) {
				continue;
			}
			else {
				total +=number;
			}
			
		}
		System.out.println("Toplam: "+total);
	}

}
