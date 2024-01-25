package Lab6;

import java.util.Scanner;

public class Lab6_7 {

	public static void main(String[] args) {
	int[] myArray = {8,5,9,0,5,-4,3,7,5,4,4,66};
	int searchIndex =0;
	boolean search = false;
	
	Scanner inputScanner = new Scanner(System.in);
	System.out.println("Aradığınız sayıyı giriniz: ");
	int number = inputScanner.nextInt();
	
	for(int i=0; i<=myArray.length-1; i++) {
		if (number==myArray[i]) {
			searchIndex =i;
			search =true;
			System.out.println("Aradığınız sayının indeksi : "+searchIndex);
		}

	}
	if (!search) {
		System.out.println("Aradığınız sayı listemizde yok.");
	}
	inputScanner.close();
}
}

