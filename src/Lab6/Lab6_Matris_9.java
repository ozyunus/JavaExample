package Lab6;
public class Lab6_Matris_9 {

	public static void main(String[] args) {
		int number = 0;
		int[][] table1 = new int[][] {
			{3,4,6},
			{3,54,8}	,
			{3,6,8}	
		};
		
		int[][] table2 = new int[][] {
			{3,4,6},
			{3,2,6},
			{33,84,6}	
		};
		
		for (int i=0; i<table1.length; i++) {
			for (int j=0; j<table1[i].length; j++) {
				if(table1[i][j]==table2[i][j]) {
					number++;
				}
			}
			
		}
		if (table1.length*table1[0].length==number) {
			System.out.println("Eşit");
		}
		else {
			System.out.println("Eşit değil");
		}
	}

}
