package Lab4;

import java.util.Scanner;

public class Lab4_17 {

	public static void main(String[] args) {
		  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci tamsayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci tamsayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int min = (sayi1 < sayi2) ? sayi1 : sayi2; 
        int ebob = 1; 

        for (int i = 2; i <= min; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i; 
            }
        }
        int ekok = (sayi1 * sayi2) / ebob;
        System.out.println("En küçük Ortak Bölen (EKOK) = " + ekok);
        scanner.close();
    }

}
