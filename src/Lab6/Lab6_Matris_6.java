package Lab6;

public class Lab6_Matris_6 {

	public static void main(String[] args) {
		int[][] table1 = new int[][] {
			{5,99,7},
			{6,7,8}
		};
		
		int[][] table2 = new int[][] {
			{2,6,5},
			{1,23,5}
		};
		
		int[][] table3 = new int[2][3];
		
		for (int i= 0; i<table3.length; i++) {
			for (int j=0; j<table1[i].length && j<table2[i].length; j++) {
				table3[i][j]= table1[i][j]-table2[i][j];
			}
		}
		
		for (int i = 0; i<table3.length; i++) {
			for (int j=0; j<table3[i].length; j++) {
				System.out.print(table3[i][j]+" ");
			}
			System.out.println();

		}

	}

}
