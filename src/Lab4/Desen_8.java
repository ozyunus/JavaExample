package Lab4;

import java.util.Iterator;

public class Desen_8 {

	public static void main(String[] args) {
		/*for (int i=0; i<=5; i++) {
			for (int j = 5-i; j>0; j--) {
				System.out.print(" ");
			}
			for (int k=5-i; k<=5; k++) {
				System.out.print("*  ");
			}
			System.out.println();
			System.out.println();
		}
			*/
		
		//Her satır için döngü
	
        for (int i = 1; i <= 5; i++) {
            // Boşlukları ekle
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }

            // Yıldızları ekle
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Bir sonraki satıra geç
            System.out.println();
        }
    } 
	}




/* burada aslında 4 boşluk sonra 1 yıldız sonra 4 yıldız gibi yapacaktım da yıldızdan sonrasını
düşünemedim beraber bakabiliriz */