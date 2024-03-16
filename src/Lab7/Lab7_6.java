package Lab7;

import java.util.Scanner;

public class Lab7_6 {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int number = inputScanner.nextInt();

		int result = tekMi(number);
		System.out.println(result);
	}
	public static int tekMi(int num1){
		int result=num1;
		if (num1 %2==0) {
		    result = -1;
		}
		else {
			result = 1;
		}

		return result;
	}

}
