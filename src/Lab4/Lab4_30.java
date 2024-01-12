package Lab4;

import java.util.Scanner;

public class Lab4_30 {

	public static void main(String[] args) {
		int total = 0;
		Scanner inputScanner = new Scanner(System.in);
		String cevap = "evet";
		
		while(cevap.equals("evet")) {
			System.out.println("Bir işlem giriniz: ");
			System.out.println("1) Toplama\n2) Çıkarma\n3) Bölme\n4) Çarpma\n5) Mod Alma");
			int choise = inputScanner.nextInt();
			System.out.println("İlk sayıyı giriniz:");
			int number1 = inputScanner.nextInt();
			System.out.println("ikinci sayıyı giriniz:");
			int number2 = inputScanner.nextInt();
			
			if(choise==1) {
				total = number1+number2;
			}
			else if(choise==2) {
				total = number1 - number2;
			}
			else if(choise==3) {
				total = number1/number2;
			}
			else if(choise==4) {
				total = number1*number2;
			}
			else if(choise==5) {
				total = number1%number2;
			}
			else {
				System.out.print("Seçeneklerden birini seçmediniz.");
			}
			System.out.println("Sonuc : "+total);
			System.out.println("Devam etmek istiyor musunuz?");
			cevap = inputScanner.next();
						
		}
		
		
	}

}
