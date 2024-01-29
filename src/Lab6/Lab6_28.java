package Lab6;

import java.util.Scanner;

public class Lab6_28 {

	public static void main(String[] args) {
		int[] myArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Aradığınız sayıyı giriniz: ");
		int number = inputScanner.nextInt();
		
		int baslangic = 0;
		int bitis = myArray.length -1;
		int sonuc = -1;
		
		while(baslangic<=bitis) {
				int orta = baslangic + (bitis - baslangic)/2;
				
				if (myArray[orta]==number) {
					sonuc=orta;
					break;
				}
				
				if(myArray[orta]>number) {
					bitis = orta-1;
				}
				else {
					baslangic = orta +1;
				}
			}
			if(sonuc != -1) {
				System.out.println("Aranan Değer İndeksi: "+sonuc);
			}
			else {
				System.out.println("Aranan numara dizide yok");
			}
			inputScanner.close();
		}

	}



