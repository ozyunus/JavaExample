package Lab4;

public class Desen_3 {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			for(int j=5-i; j>0; j-- ) {
				System.out.print(" ");
			 }
			for (int y=1; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
