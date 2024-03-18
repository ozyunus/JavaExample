package Lab7;

public class Lab7_10 {

	public static void main(String[] args) {
		int[] table = {2,3,4,5,6,7,8};
		int tableLength = table.length;
		
		int karelerToplami = kareTopla(table, tableLength);
		System.out.println(karelerToplami);

	}
	
	public static int kareTopla(int[]table, int tableLength) {
		int total = 0;
		
		for (int i=0; i<tableLength; i++) {
			total += table[i]*table[i];
		}
		return total;
	}

}
