package Lab6;

public class Lab6_Matris_7 {

	public static void main(String[] args) {
		int satirSayisi=0;
		
		int[][] table = new int[][] {
			{3,4,0,9,0},
			{4,5,3,2,7}
		};
		
		for (int i= 0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				if(table[i][j]==0) {
					satirSayisi = table[i][j];
				}
			}
		}
		System.out.println(satirSayisi+ " satırı sıfır sonuç verir");
	}

}
