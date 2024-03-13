package Lab6;

public class Lab6_Matris_17 {

	public static void main(String[] args) {
		int notEqual=0;
		int number=0;
		int number2=0;
		int count=0;
		int[][] table = {
				{100,3,5},
				{7,9,11},
				{13,15,17},
				{130,15,17}
		};
		
		int[][] table2 = {
				{1,33,5},
				{7,9,11},
				{130,10,17},
				{13,15,17}
		};
		
		for (int i=0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				number= table[i][j];
				count=0;
				for (int k=0; k<table2.length; k++) {
					for (int l=0; l<table2[0].length; l++) {
						number2= table2[k][l];
						if(number==number2) {
							count++;
						}
					}
					
				}
				if (count<1) {
					System.out.println(number);
				}
			}
			
		}
		
		
	}

}
