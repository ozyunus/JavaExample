package Lab6;

import java.util.Scanner;

public class Lab6_20 {

	public static void main(String[] args) {
		int [] myArray = {0,4,5,6,7,154,76};
		boolean isTrue = false;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int number = inputScanner.nextInt();
		
		for(int i=0; i<myArray.length; i++) {
			for (int j=0; j<myArray.length-i; j++) {
				if (number == myArray[i]+myArray[j]) {
					System.out.println(i+" ve "+ j+" toplamı sayıya eşit");
					isTrue = true;
				}
				
			}
		}
		if (!isTrue) {
			System.out.println("Eşit değil.");
		}
		inputScanner.close();
		
	}

}


// burada aynı sayıyı 2 kez çağırıyorum. Dönücem