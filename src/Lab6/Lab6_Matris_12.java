package Lab6;

public class Lab6_Matris_12 {

	public static void main(String[] args) {
		int[][] table2 = {{3,4,5},
						  {5,6,7}
	};
		int[][] tableNew = new int[table2[0].length][table2.length];
	
	for (int i=0; i<table2[0].length; i++) {
		for (int j=0; j<table2.length; j++) {
			tableNew[i][j]= table2[j][i];
		}
	}
	for (int i=0; i<tableNew.length; i++) {
		for (int j=0; j<tableNew[i].length; j++) {
			System.out.print(tableNew[i][j]);
		}
		System.out.println();
	}

}
}