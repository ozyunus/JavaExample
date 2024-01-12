package Lab4;

public class Desen_13 {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=5-i; j<5; j++) {
				System.out.print("* ");
			}
			for (int j=1; j<=10-(2*i); j++) {
				System.out.print("  ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for (int i=1; i<5; i++) {
			for (int j=5-i; j>=1; j--) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	
	/*	for (int i=1; i<5; i++) {			
			for (int j=5+i; j>=1; j++) {
				System.out.print(" ");
			}
			for (int k=1; k>i; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		} */
	}
}

// bakalım

