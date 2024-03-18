package Lab7;

public class Lab7_12 {

	public static void main(String[] args) {
		int[] table = {-82,3545564,4,5};
		int tableLength = table.length;
		
		int maksimumSayi = maksimumuBul(table, tableLength);
		System.out.println("Maksimum: "+maksimumSayi);
	}
	
	public static int maksimumuBul(int[] arrays, int tLength) {
		int max=arrays[0];
		
		for (int i=0; i<tLength; i++) {
			if(arrays[i]>max) {
				max = arrays[i];
			}
		}
		return max;
	}

}
