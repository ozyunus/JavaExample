package Lab6;

import java.util.Scanner;

public class Lab6_7 {

	public static void main(String[] args) {
	int[] myArray = {0,5,-4,3,7,5,4,4,66};
	int searchIndex =0;
	
	Scanner inputScanner = new Scanner(System.in);
	System.out.println("Aradığınız sayıyı giriniz: ");
	int number = inputScanner.nextInt();
	
	for(int i=0; i<myArray.length; i++) {
		if (number==myArray[i]) {
			searchIndex =i;
		}
		
	}
	if (searchIndex>0) {
		System.out.println("Aradığınız sayının indeksi : "+searchIndex);
	}
	else {
		System.out.println("Aradığınız sayı listemizde yok.");
	}
	inputScanner.close();
}
}

// 5 i istediğimde 2. 5 in indexini söylerken 4 dediğimde ilk 4 ün indexini söylüyor, bakalım