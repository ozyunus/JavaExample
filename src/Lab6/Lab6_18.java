package Lab6;

public class Lab6_18 {

	public static void main(String[] args) {
        int[] dizi = {1, 2, 2, 2, 3, 4, 5, 1, 2, 6, 7, 8, 9, 3, 4, 10, 3, 3};

        int enCokTekrarEdenEleman = -1;
        int enCokTekrarSayisi = 0;
        
        int enCokTekrarEdenEleman2 = -1;
        int enCokTekrarSayisi2 = 0;

        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            int tekrarSayisi = 0;

            for (int j = 0; j < dizi.length; j++) {
                if (eleman == dizi[j]) {
                    tekrarSayisi++;
                }
            }

            if (tekrarSayisi > enCokTekrarSayisi) {
                enCokTekrarEdenEleman = eleman;
                enCokTekrarSayisi = tekrarSayisi;
            }
            else if (tekrarSayisi == enCokTekrarSayisi){
				enCokTekrarEdenEleman2 = eleman;
                enCokTekrarSayisi2 = tekrarSayisi;
			}
            
        }
        if (enCokTekrarSayisi==enCokTekrarSayisi2) {
        	System.out.println("En çok tekrar eden sayılar: "+enCokTekrarEdenEleman+", "+enCokTekrarEdenEleman2);
        	System.out.println("Tekrar Sayısı: "+ enCokTekrarSayisi);
        }
        else {
        	System.out.println("En çok tekrar eden sayılar: "+enCokTekrarEdenEleman);
        	System.out.println("Tekrar Sayısı: "+ enCokTekrarSayisi);
		}
	}
}