package Lab7;

public class Lab7_28 {

	public static void main(String[] args) {
		long sayi=63L;
		
		long big= birinciBuyukVer(sayi);
		System.out.println("Büyük basamak: "+ big);
	}
	
	public static long birinciBuyukVer(long sayi) {
		long sayiNew = sayi%10;
		
		sayi-=sayiNew;
		while (sayi>9) {
			sayi/=10;
		}
		return sayi;
	}

}
