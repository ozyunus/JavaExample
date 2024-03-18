package Lab7;

import java.util.Scanner;

public class Lab7_13 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int num = inputScanner.nextInt();
		
		int sonuc= asalBul(num);
		System.out.println("Sonuç: "+sonuc);
		
	}
	public static int asalBul(int num) {
		int count=0;
		int result=0;
		
		for (int i=1; i<num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==1) {
			result =1;
		}
		else {
			result= -1;
		}
		
		return result;
	}

}
