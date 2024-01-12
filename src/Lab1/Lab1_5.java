package Lab1;
import java.util.*;

public class Lab1_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Bir tam sayı giriniz: ");
		int tamSayi = input.nextInt();
		
		int karesi = tamSayi * tamSayi;
		System.out.println("Sayının Karesi: "+karesi);
		
		int kupu = tamSayi  * tamSayi * tamSayi;
		System.out.print("Sayının Küpü: "+kupu);		
	}

}

// tam sayı mı ? diye nasıl kontrol ederim?  
// input ötüyor ama girdi yaptığımda da ötüyor hatam nedir ? 