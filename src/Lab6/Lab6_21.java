package Lab6;

import java.util.Arrays;

public class Lab6_21 {

	public static void main(String[] args) {
		int[] myArray1 = {3,4,6,7,88,99,2}; 
		int[] myArray2 = {3,99,2}; 
		boolean isTrue = false;

		for (int i=0; i<myArray1.length; i++) {
			for (int j=0; j<myArray2.length; j++) {
				if (myArray1[i] == myArray2[j]) {
					isTrue = true;
				}
			}
		}
		if (!isTrue) {
			System.out.println("Alt küme değildir.");
		}
		else {
			System.out.println(" Alt küme");
			System.out.println(Arrays.toString(myArray2));
		}
	}

}
