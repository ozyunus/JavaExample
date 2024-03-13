package Lab6;

public class Lab6_Matris_18 {

	public static void main(String[] args) {
		int count1 = 0;
		int count0 = 0;
		int boyut = 0;

		int[][] table = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (i == j) {
					if (table[i][j] == 1) {
						count1++;
					}

				} else if (table[i][j] == 0) {
					count0++;
				}

			}

		}
		boyut = table.length*table[0].length;
		
		if (boyut == count0 + count1) {
			System.out.println("Matris");
		} else {
			System.out.println("Değil");
		}


	}
}