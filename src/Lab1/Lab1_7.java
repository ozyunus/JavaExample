package Lab1;
import java.util.*;

public class Lab1_7 {
	public static void main(String[] args) {
		int kdv = 18;
		
		Scanner girilenDeger = new Scanner (System.in);
		System.out.print("Fiyatı Giriniz: ");
		float fiyat = girilenDeger.nextFloat();
				
		float kdvliFiyat = (fiyat*0.18f) + fiyat;
		System.out.print("Kdv'li fiyat :"+kdvliFiyat);
	}
}
