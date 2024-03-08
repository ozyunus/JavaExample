package Lab6;
public class Lab6_Matris_9 {

	public static void main(String[] args) {
		int number = 0;
		int[][] table1 = new int[][] {
			{3,4,6},
			{3,6,8}	
		};
		
		int[][] table2 = new int[][] {
			{3,84,6},
			{3,6,8}	
		};
		
		for (int i=0; i<table1.length; i++) {
			for (int j=0; j<table1[i].length; j++) {
				if(table1[i][j]!=table2[i][j]) {
					System.out.println("Eşit değil");
					break;
				}
				else {
					number++;
				}
				
			}
			
		}
		if (table1.length*table1[0].length==number) {
			System.out.println("Eşit");
		}
		
	}

}
