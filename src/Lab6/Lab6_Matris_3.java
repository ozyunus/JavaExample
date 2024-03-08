package Lab6;

public class Lab6_Matris_3 {

	public static void main(String[] args) {
		int total =0;

		int[][] table = new int [][] {
			{1,2,-3},
			{-1,3,5},
			{-9,2,3}
		};
				
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				if (table[i][j]<0) {
					total += table[i][j];
				}
			}
		}
		System.out.println(total);
	}

}
