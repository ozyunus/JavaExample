package Lab4;

import java.util.Scanner;

public class Lab4_Ek_1 {

	public static void main(String[] args) {
		int totalNumber=0;
		int numberCount=0;
		int avarageNumber=0;
		int limit = 0;
		
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Kaç sayı girmek istersiniz?");
		int numberMind = inputScanner.nextInt();
			
		System.out.println("Limit giriniz: ");
		limit = inputScanner.nextInt();
		
		
		while (limit>totalNumber) {
			System.out.println("Lütfen Sayı giriniz: ");
			int newNumber = inputScanner.nextInt();
			
			totalNumber += newNumber;
			numberCount++;
			
			avarageNumber = totalNumber / numberCount;
		}
		System.out.println("Toplam: "+totalNumber+"\nOrtalama: "+avarageNumber+"\nLimit :"+limit+"\nSayı Adedi :"+numberCount);
		
	}

}

// sayıyı neden aldık ? zaten adet geçince de durdurmuyoruz ?

