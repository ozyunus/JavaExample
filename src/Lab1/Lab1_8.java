package Lab1;
import java.util.*;

public class Lab1_8 {

	public static void main(String[] args) {
		float Yol;
		Scanner girdiHiz = new Scanner(System.in);
		System.out.println("Hızınızı Giriniz: ");
		float Hiz = girdiHiz.nextFloat();
		
		Scanner girdiSure = new Scanner(System.in);
		System.out.println("Yolculuk Sürenizi Dakika olarak Giriniz: ");
		float Sure = girdiSure.nextFloat();
		
		Yol = Hiz * Sure;
		System.out.print("Gidilen Yol: "+Yol+" metre yol gidilmiştir." );
	}

}
