package Lab7;

public class Lab7_8 {

	public static void main(String[] args) {
		int[]table = {-4,-2,4,5,-55,4,-5};
		int arrayLenght = table.length;
		
		int num= negatifBul(arrayLenght, table);
		System.out.println(num);
	}
	
	public static int negatifBul(int arrayLength, int[]table ) {
		int total=0;
		
		for (int i=0; i<arrayLength; i++) {
			if (table[i]<0) {
				total +=table[i];
			}
		}
		return total;
	}

}
