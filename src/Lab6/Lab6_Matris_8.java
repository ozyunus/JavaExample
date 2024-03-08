package Lab6;

import java.util.Scanner;

public class Lab6_Matris_8 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz: ");
		int number = inputScanner.nextInt();
		
		int[][] table = new int[][] {
			{2,3},
			{4,5}
		};
		
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				table[i][j]=number*table[i][j];
			}
		}
		
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				System.out.print(table[i][j]+ " ");
			}
			System.out.println();

		}
	}

}
