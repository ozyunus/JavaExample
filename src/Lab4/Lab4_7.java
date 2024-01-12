package Lab4;

import java.util.Scanner;

public class Lab4_7 {

	public static void main(String[] args) {
		int avarage=1;
		int total=1;
		int count=0;
				
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int number = inputScanner.nextInt();
		
		System.out.print("\nİlk "+number+" çift sayı: ");

		if(count<number) {
		for(int i=0; i<number*2;) {
			
			total +=i;
			count++;
			avarage = total/count;
			System.out.print(" "+i);
			i+=2;
		}
		System.out.print("\nOrtalama: "+avarage);
		inputScanner.close();
	}

}
}
	