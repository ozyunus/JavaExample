package Lab7;

import java.util.Scanner;

public class Lab7_30 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int number = inputScanner.nextInt();
		
		int jenericNumber = jenerikDondur(number);
		System.out.println(jenericNumber);
	
	}
	public static int jenerikDondur(int number) {
		int total=0;
		int kalan =0;
		int jenerik=0;
		
		while(number>0) {
			kalan = number%10;
			number-=kalan;
			total+=kalan;
			kalan=0;
			number/=10;
		}
		
		while(total>0) {
			kalan = total%10;
			total-=kalan;
		    jenerik+=kalan;
			kalan=0;
			total/=10;
		}
		
		
		return jenerik;
	}
}
