package Lab7;

import java.util.Scanner;

public class Lab7_15 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int num = inputScanner.nextInt();

		int toplam = rakamlarıTopla(num);
		System.out.println("Toplam: "+toplam);
		
		inputScanner.close();
	}
	public static int rakamlarıTopla(int num) {
		int result =0;
		
		while (num > 0) {
            int digit = num % 10;
            result +=digit;
            num /= 10;
        }
		return result;
	}

}
