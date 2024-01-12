package Lab4;

public class Desen_9 {

		public static void main(String[] args) {
			// Her satır için döngü
	        for (int i = 5; i >= 1; i--) {
	            // Boşlukları ekle
	            for (int j = 1; j <= 5-i; j++) {
	                System.out.print(" ");
	            }

	            // Yıldızları ekle
	            for (int k = 1; k <= 2*i-1; k++) {
	                System.out.print("*");
	            }

	            // Bir sonraki satıra geç
	            System.out.println();
	        }
	    
		}
}

// burada satır sayısını belirleyen for daki döngüyü 
// 1 ++ yapınca düz 5 -- yapınca ters ağaç oluşuyor ama bunu anlayamadım. Bakalım
