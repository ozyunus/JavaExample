package Lab6;

public class Lab6_Matris_10 {

	public static void main(String[] args) {
		int total =0;
		int[][] table = new int[][] {
			{2,4,6},
			{3,6,9}
		};
		
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				
					total +=table[i][j];
				
			}	
			System.out.println(i+1+".Satır toplamı: "+total);
			total=0;
		}
	}

}
