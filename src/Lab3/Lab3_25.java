package Lab3;

import java.util.Scanner;

public class Lab3_25 {

	public static void main(String[] args) {
		double sonuc= 0;
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("+ " + "- " + "* "+"/ " + " %");
		System.out.print("İşlem operatörünü giriniz: ");
		String choise = girdi.next();
		
		System.out.print("İlk sayıyı giriniz :");
		int number1 = girdi.nextInt();
		
		System.out.print("İkinci sayıyı giriniz :");
		int number2 = girdi.nextInt();
		
		if (choise.equals("+")) {
			sonuc = number1 + number2;
		}
		else if(choise.equals("-")) {
			sonuc = number1 - number2;
		}
		else if(choise.equals("*")) {
			sonuc = number1 * number2;
		}
		else if (choise.equals("/")) {
			sonuc = number1 / number2;
		}
		else if (choise.equals("%")){
			sonuc = number1 % number2;
		}
		else {
			System.out.print("Yanlış operatör seçimi yaptınız.");
		}
		System.out.print(sonuc);
	}

}
