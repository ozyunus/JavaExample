package Lab6;

import java.util.Arrays;

public class Lab6_24 {

	public static void main(String[] args) {
		/*
		int[] myArray1= {1,3,4,6,7,8,11,13};
		int[] myArray2= {1,2,5,9,10,12,14,0};
		int[] newArray = new int[myArray1.length+myArray2.length];
		                          
		for(int i=0; i<newArray.length; i++) {
				newArray[i]= myArray1[i];
				newArray[i+1]=myArray2[i];
				newArray[i]++;
				}
			
		
		System.out.println(Arrays.toString(newArray));
		*/
		int[] dizi1 = {1, 3, 5, 7, 9};
        int[] dizi2 = {2, 4, 6, 8, 10};

        // Yeni bir boş diziyi oluşturun
        int[] birlesikDizi = new int[dizi1.length + dizi2.length];

        // İki diziyi birleştirin
        int i = 0, j = 0, k = 0;
        while (i < dizi1.length && j < dizi2.length) {
            if (dizi1[i] < dizi2[j]) {
                birlesikDizi[k++] = dizi1[i++];
            } else {
                birlesikDizi[k++] = dizi2[j++];
            }
        }

        // İkinci dizinin kalan elemanlarını ekleyin (eğer varsa)
        while (i < dizi1.length) {
            birlesikDizi[k++] = dizi1[i++];
        }

        while (j < dizi2.length) {
            birlesikDizi[k++] = dizi2[j++];
        }

        // Birleştirilmiş diziyi ekrana yazdırın
        System.out.print("Birleştirilmiş Dizi: ");
        for (int num : birlesikDizi) {
            System.out.print(num + " ");
        }

	} 

}

// mantığını çözemedim. bakarık 
