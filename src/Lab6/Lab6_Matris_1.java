package Lab6;

import java.util.Scanner;

public class Lab6_Matris_1 {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Matrisin satır sayısını giriniz: ");
		int row = inputScanner.nextInt();
		
		System.out.println("İkinci sütun sayısını giriniz: ");
		int column = inputScanner.nextInt();
		
		int[][] table = new int[row][column];
		
		for (int j=0; j<table.length; j++) {

			for (int i=0; i<table[0].length; i++) {
				System.out.println(j+" satırın "+ i +". sayısını giriniz:"); 
				table[j][i]= inputScanner.nextInt();
				
			}
		}
		
		for (int j=0; j<table.length; j++) {
			for(int i=0; i<table[0].length; i++) {
				System.out.print(table[j][i]+" ");
			}
			System.out.println();
		}
	}

}
