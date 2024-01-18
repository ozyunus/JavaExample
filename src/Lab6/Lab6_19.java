package Lab6;

import java.util.Arrays;

public class Lab6_19 {

	public static void main(String[] args) {
		int[] myArray = {4,5,6,7,3,4};
		int count = 0;
		int[] numbersArray = new int[myArray.length];
		int[] countsArray = new int[myArray.length];
		
		for (int i=0; i<myArray.length; i++) {
			
			for(int j=0; j<myArray.length; j++) {
				if (myArray[i]==myArray[j]) {
					numbersArray[i]=myArray[i];
					countsArray[i]+=1; 
				}
			}
		}
		System.out.print("count "+Arrays.toString(countsArray)+", ");
		System.out.print("\nnumara "+Arrays.toString(numbersArray)+", ");
	}

}


// tek tek yazdırma ile ilgili algoritmayı düşünemedim :)