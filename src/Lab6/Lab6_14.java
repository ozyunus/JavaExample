package Lab6;

import java.util.Arrays;
import java.util.Iterator;

public class Lab6_14 {

	public static void main(String[] args) {
		int[] myArray = {3,5,7,9};
		int n = myArray.length;
		
		for(int i=0; i<n/2; i++) {
			int temp = myArray[i];
			myArray[i]= myArray[n-i-1];
			myArray[n-i-1]=temp;
		}
		System.out.println(Arrays.toString(myArray));
	}
}
