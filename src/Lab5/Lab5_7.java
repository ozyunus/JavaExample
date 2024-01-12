package Lab5;

import java.util.Scanner;

public class Lab5_7 {

	public static void main(String[] args) {
	
	int total=0;
	Scanner inputScanner = new Scanner(System.in);
	
	for (int i=0; i<100 && total <1000; i++) {
		System.out.println("Bir sayı giriniz: ");
		int number = inputScanner.nextInt();
		total +=number;
		
		if(total>=1000) {
			System.out.println("Erken Toplam: "+total);
			
		}
	}
	System.out.println("Toplam: "+total);
	}

}
