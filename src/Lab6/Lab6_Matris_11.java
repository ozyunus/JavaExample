package Lab6;

public class Lab6_Matris_11 {

	public static void main(String[] args) {
		int total=0;
		int[][] table = new int[][] {
			{3,4,5,2},
			{2,4,5,7},
			{2,4,5,7},
			{2,4,5,7},
			{2,4,5,7}
		};
		for (int i=0; i<table[0].length; i++) {
			for(int j=0; j<table.length; j++) {
				total+=table[j][i];
			}
			System.out.println(i+1+".sütun toplamı: "+total);
			total=0;
		}
	}

}
