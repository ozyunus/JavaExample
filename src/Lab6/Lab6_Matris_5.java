package Lab6;

import java.util.Iterator;

public class Lab6_Matris_5 {

	public static void main(String[] args) {
		int[][] table = new int [][] {
			{2,4},
			{4,2}
		};
		
		int[][] table2 = new int[][] {
			{1,3},
			{5,6}
		};
		
		int[][] table3 = new int[2][2]; 
		
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length && j<table2[i].length; j++) {
				table3[i][j]= table[i][j] + table2[i][j];
			}
		}
		
		for (int i=0; i<table3.length; i++) {
			for (int j=0; j<table3[i].length; j++) {
				System.out.print(table3[i][j]);
			}
			System.out.println();
		}
	}

}
