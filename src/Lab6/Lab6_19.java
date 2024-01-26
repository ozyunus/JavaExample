package Lab6;

import java.util.Arrays;
import java.util.Iterator;


public class Lab6_19 {

	public static void main(String[] args) {
		int[] myArray = {4,5,6,7,3,4,8};
		int[] farkliSayilar = new int[myArray.length];
		int[] countsArray = new int[myArray.length];
		int sayac = 0;
		
		for (int i=0; i<myArray.length; i++) {
			int count=0;

			boolean varmi = false;
			for(int j=0; j<farkliSayilar.length; j++) {
				if (farkliSayilar[j] ==myArray[i])
					varmi = true;
			}
		
			if(varmi == false) {
				farkliSayilar[sayac]=myArray[i];
			}

			for(int j=0; j<myArray.length; j++) {
				if (myArray[i]==myArray[j]) {
					count++;
				}
			}
			if(varmi == false) {
				countsArray[sayac]=count;
				sayac++;
			}
		}
		System.out.println("Dizi: "+Arrays.toString(myArray));
		for (int i= 0; i<sayac; i++) {
			System.out.println(farkliSayilar[i]+"= "+countsArray[i]+" kez tekrar etti.");
		}
	}

}


