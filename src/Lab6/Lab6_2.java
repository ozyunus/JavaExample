package Lab6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Lab6_2 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int []numberArrays = new int [10];
		
		for (int i=0; i<10; i++) {
			System.out.println("Lütfen bir sayı giriniz: ");
			int number = inputScanner.nextInt();
			numberArrays[i]= number;
		}
		
		for (int j = numberArrays.length-1; j>=0; j--)
			System.out.println(j);
			//System.out.println(Arrays.toString(numberArrays));
			//inputScanner.close();
	}

}

// tekte de yazdırabilir miyim? 