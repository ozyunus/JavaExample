package Lab1;
import java.util.*;

public class Lab1_6 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner (System.in);
		System.out.println("Kenar uzunluğu giriniz: ");
		float kenar = girdi.nextFloat();
		float kupYuzeyHesabi = (kenar*kenar) * 6;
		System.out.print("Küpün yüzey alanı: "+kupYuzeyHesabi+"cm'dir.");
	}

}
