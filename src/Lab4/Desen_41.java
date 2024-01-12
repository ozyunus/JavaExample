package Lab4;

public class Desen_41 {

	public static void main(String[] args) {
		char j = 'A';
		for (int i=0; i<=5; i++) {
			for (int k=0; k<=4-i; k++) {
				System.out.print(" ");
			}
			for (int c=0; c<=i; c++) {	
				System.out.print(j+ " ");
				j++;
			}
			System.out.println();
			j = 'A';
		}

	}

}
