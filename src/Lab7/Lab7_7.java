package Lab7;

public class Lab7_7 {

	public static void main(String[] args) {
		int[] table = {3,5,7,9,11};
		int diziBoyutu = table.length;
		
		int ortalama= avarage(diziBoyutu, table); 
		System.out.println(ortalama);
		
	}
	public static int avarage(int arrayLenght, int[]table) {
		int avarageNum =0;
		int total=0;
		int count =0;
		
		for (int i=0; i<arrayLenght; i++) {
			total +=table[i];
			count++;
		}
		if (count==arrayLenght) {
			avarageNum = total/count;
		}
		return avarageNum;
	}
}
