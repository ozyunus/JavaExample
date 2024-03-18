package Lab7;

public class Lab7_7 {

	public static void main(String[] args) {
		int[] table = {3,5,7,9,11};
		int diziBoyutu = table.length;
		
		avarage(diziBoyutu, table);
		
	}
	public static void avarage(int arrayLenght, int[]table) {
		int avarage =0;
		int total=0;
		int count =0;
		
		for (int i=0; i<arrayLenght; i++) {
			total +=table[i];
			count++;
		}
		if (count==arrayLenght) {
			avarage = total/count;
		}
		System.out.println("Avarage : "+avarage);
	}
}
