package Lab4;

import java.util.Scanner;

public class Lab4_9 {

	public static void main(String[] args) {
		int number=0;
		Scanner inputScanner = new Scanner(System.in);
		int count=0;
		int bigNumber = 0;
		int total=0;
		double avarage=0.f;
		
		while(number>=0) {
			System.out.println("Lütfen bir sayı giriniz: ");
			number = inputScanner.nextInt();
			count++;
			
			if(number>bigNumber) {
				bigNumber = number;
			}
			if(number>=0) {
				total += number;
				avarage = (double)total / count;
			}
			}

		System.out.println("Toplam: "+total);
		System.out.println("Ortalama: "+avarage);
		System.out.println("Büyük sayı: "+bigNumber);
		inputScanner.close();
		
	}

}
