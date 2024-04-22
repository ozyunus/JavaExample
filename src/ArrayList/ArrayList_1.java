package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_1 {

	public static void main(String[] args) {

		ArrayList<String> elemanlar = new ArrayList<>();	
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Kaç eleman gireceğinizi belirtiniz: ");
		int inputNumber = inputScanner.nextInt();
		
		for(int i=0; i<inputNumber; i++) {
			System.out.println("Eleman adını giriniz: ");
			String inputEleman = inputScanner.next();
			elemanlar.add(inputEleman);
		}
		for(String inputEleman: elemanlar) {
			System.out.println(inputEleman);
		}
		
		
		
				
	}

}
