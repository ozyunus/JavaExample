package Lab6;

public class Lab6_Matris_21 {

	public static void main(String[] args) {
		int count =0;
		int[][] table = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,97}
		};
		
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				for (int k=2; k<=table[i][j]; k++) {
					if(table[i][j]%k==0) {
						count++;						
					}
				}
				if (count==1) {
					System.out.println(table[i][j]+" Asal Sayıdır.");
				}
				count =0;

			}

		}
	}

}
