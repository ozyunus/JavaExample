package Lab4;

import java.util.Iterator;

public class Desen_40 {

	public static void main(String[] args) {
		char j='A';
		for (int i=0; i<=5; i++) {
			for (int c=0; c<=i; c++) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			j='A';
		}
	}

}
