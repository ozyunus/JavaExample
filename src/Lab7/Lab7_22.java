package Lab7;

public class Lab7_22 {

	public static void main(String[] args) {
		int[] table = {2,4,5,6,7,8,9,-9,8,1,454};
		int tableLenght = table.length;
		
		int difference = kucukBuyukDondur(table, tableLenght);
		System.out.println("Fark: "+difference);

		
	}
	
	public static int kucukBuyukDondur(int[]table, int tableLenght) {
		int min=table[0];
		int max=table[0];
		int difference=0;
		
		for (int i=0; i<tableLenght; i++) {
			if(table[i]<=min) {
				min = table[i];
			}
			else if(table[i]>max) {
				max = table[i];
			}
		}
		difference = max-min;
		return difference;
	}

}
