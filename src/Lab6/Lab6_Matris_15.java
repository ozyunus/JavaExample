package Lab6;

public class Lab6_Matris_15 {

	public static void main(String[] args) {
		int total =0;
		int[][] table= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
			
			for (int i=0; i<table.length; i++) {
				for (int j=0; j<table[i].length; j++) {
					if( i ==j || i+j== table.length-1) {
						total+= table[i][j];
				}
				
			}

	}
			System.out.println("Toplam : "+total);

}
}

