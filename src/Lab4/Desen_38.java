package Lab4;

public class Desen_38 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // İlk iç içe döngü: Artan sayıları yazdır
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // İkinci iç içe döngü: Boşlukları yazdır
            for (int j = 1; j <= 10 - (2 * i); j++) {
                System.out.print(" ");
            }

            // Üçüncü iç içe döngü: Azalan sayıları ters sıra ile yazdır
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }

            // Bir sonraki satıra geç
            System.out.println();
        }
    }
}





/*package Lab4;

public class Desen_38 {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int k=1; k<=i; k++) {
				System.out.print(k);
			}
			for (int j=1; j<=10-(2*i); j++) {
				System.out.print(" ");
			}
			for (int l=1; l<=i; l++) {
				
				System.out.print(l);
				
				
			}
			System.out.println();
		}

	}

}
 */