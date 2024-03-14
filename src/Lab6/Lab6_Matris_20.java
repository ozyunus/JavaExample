package Lab6;

public class Lab6_Matris_20 {

	public static void main(String[] args) {
		int bigNumber=0;
		int[][] table = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				if(table[i][j]>bigNumber) {
					bigNumber=table[i][j];
				}
			}
		}
		System.out.println("En büyük Eleman: "+bigNumber);
	}

}
