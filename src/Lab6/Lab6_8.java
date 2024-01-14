package Lab6;

import java.util.Scanner;

public class Lab6_8 {

	public static void main(String[] args) {
		int [] myArray = {3,4,5,3,4,55,6,7,4};
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int number = inputScanner.nextInt();
		int count = 0;
		
		for (int i=0; i<myArray.length; i++) {
			if (number==myArray[i]) {
				count++;
			}
		}
		System.out.println("Verilen sayı lisetede "+count+" adet var.");
		inputScanner.close();
	}

}
