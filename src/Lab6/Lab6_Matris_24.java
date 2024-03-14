package Lab6;

public class Lab6_Matris_24 {

	public static void main(String[] args) {
		int total = 0;
		int bigNumber = 0;
		int row = 0;

		int[][] table = { { 1, 2, 1000 }, { 40000, 5, 16, 8 }, { 5, 690090, 7, 8, 99 } };
		for (int i = 0; i < table.length; i++) {
			total += table[0][i];
			bigNumber = total;
		
		}
		total = 0;

		for (int i = 1; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				total += table[i][j];
			}
			if (total > bigNumber) {
				bigNumber = total;
				row=i;

			}
			total = 0;
		}
		System.out.println(row + ": satır " + bigNumber);

	}
}