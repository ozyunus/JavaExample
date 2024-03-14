package Lab6;

public class Lab6_Matris_23 {

	public static void main(String[] args) {
		int number = 0;
		int[][] table = { { 10, 30, 50, 6 }, { 4, 56, 7,9 }, { 40, 66, 90 } };

		for (int i = 0; i < table.length; i++) {
			int minimum = table[i][0];
			for (int j = 0; j < table[i].length; j++) {
				number = table[i][j];
				if(number<minimum) {
					minimum=number;
				}
				
			}
			System.out.println("min "+minimum);
		}
	}

}
