package Lab6;

import java.util.Scanner;

public class Lab6_Matris_19 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Aranacak sayıyı giriniz: ");
		int number = inputScanner.nextInt();
		int row =-1;
		int column =-1;
		
		int[][] table = {
				{1,3,5},
				{7,9,11},
				{13,15,17}
		};
		
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				if (number==table[i][j]){
					row =i;
					column =j;
				}
				
			}
		}
		if(row>=0) {
			System.out.println("Aranan sayı: "+row+" satırı ve "+column+" sütunundadır.");
		}
		else {
			System.out.println("Aranan sayı bulunamadı.");
		}
	}

}
