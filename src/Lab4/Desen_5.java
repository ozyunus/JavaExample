package Lab4;

public class Desen_5 {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=5; j>6-i; j--) {
				System.out.print(" ");
			}
			for (int k=5-i; k>=0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
