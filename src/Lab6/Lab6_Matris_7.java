package Lab6;

public class Lab6_Matris_7 {

	public static void main(String[] args) {
		int satirSayisi=0;
		
		int[][] table = new int[][] {
			{3,4,9,9,8},
			{4,7,3,2,7},
			{4,0,0,2,0}
		};
		
		for (int i= 0; i<table.length; i++) {
			for (int j=0; j<table[i].length; j++) {
				if(table[i][j]==0) {
					satirSayisi++;
					break;
					
				}
			}
		}
		System.out.println(satirSayisi+ " adet satır sıfır sonuç verir");
	}

}
