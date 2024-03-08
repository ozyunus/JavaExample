package Lab6;

public class Lab6_Matris_2 {

	public static void main(String[] args) {
		int [][] table = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		int total =0;
		
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				total += table[i][j];
			}
		}
		System.out.println(total);
	}

}
