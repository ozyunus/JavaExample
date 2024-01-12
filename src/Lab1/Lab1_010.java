package Lab1;

import java.util.Scanner;

public class Lab1_010 {

	public static void main(String[] args) {
		int total;
		int difference; 
		
		Scanner number1 = new Scanner(System.in);
		System.out.print("Birinci Sayıyı Giriniz: ");
		int num1 = number1.nextInt();
		
		Scanner number2 = new Scanner(System.in);
		System.out.print("İkinci Sayıyı Giriniz: ");
		int num2 = number2.nextInt();
		
		total = num1 + num2;
		System.out.println("Sayılarım Toplamı: "+total);
		
		difference = num1-num2;
		System.out.print("Sayıların Farkı: "+difference);
	}

}

// burada ilk değer küçükse ara farkı eksi değerle gösteriyor bunu nasıl çözmek gerekir ?
