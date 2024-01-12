package Lab4;

import java.util.Scanner;

public class Lab4_11 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int number = inputScanner.nextInt();
		
		int basamakSayisi=0;
		int newNumber=number;
		
		while(newNumber !=0) {
			newNumber/=10;
			basamakSayisi++;
		}
		System.out.println(number+" sayısı "+basamakSayisi+" basamaklıdır.");
		inputScanner.close();

}
}