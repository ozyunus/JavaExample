package Lab6;

public class Lab6_Matris_4 {

	public static void main(String[] args) {
		int count =0;
		int[][] table = new int[][]{
			{0,4,0},
			{0,0,5},
			{0,0,5},
			{0,3,6},
			{0,0,3},
			{0,6,8}
		};
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				if(table[i][j]==0) {
					count++;
				}
			}
		}
		if ((table.length*table[0].length)/2 <count) {
			System.out.println("Spars");
		}
		else {
			System.out.println("Değil");
		}
	}

}
