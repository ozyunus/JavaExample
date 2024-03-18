package Lab7;

import java.util.Scanner;

public class Lab7_11 {

	public static void main(String[] args) {
		int[]table = {2,3,4,56,77,8,9,66,4,3,-5};
		int arrayLength = table.length;
		int aranan=0;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Aranacak sayıyı giriniz: ");
		aranan = inputScanner.nextInt();
		
		int bulunan = ara(table, arrayLength, aranan);
		System.out.println("Aranan değerin indeksi: "+bulunan);
	}
	
	public static int ara(int[]table, int arrayLegth, int aranan) {
		int result=0;
		int count =0;
		for (int i=0; i<arrayLegth; i++) {
			if(aranan == table[i]) {
				result =i;
				break;
			}
			else {
				count++;
			}

		}
		if(count==arrayLegth) {
			result = -1;
		}
		return result;
	}

}
