package Lab7;

public class Lab7_9 {

	public static void main(String[] args) {
		int[] table = {3,5,2,6,8};
		int tableLength = table.length;
		
		ciftSayiVer(table, tableLength);
	}
	
	public static void ciftSayiVer(int[]table ,int tableLenght) {
		int cift=0;
		for (int i=0; i<tableLenght; i++) {
			if(table[i]%2==0) {
				cift=table[i];
				System.out.println(cift);
			}
		}
	}

}
