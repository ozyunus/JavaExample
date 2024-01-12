package Lab3;

import java.util.Scanner;

public class Lab3_29 {

	public static void main(String[] args) {
		double dusukNot=0;
		double yuksekNot=0;
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("Matematik Ders Notunu 0-100 arası giriniz: ");
		double mathNot = girdi.nextDouble();
		
		System.out.print("Fizik Ders Notunu 0-100 arası giriniz: ");
		double fizikNot = girdi.nextDouble();
		
		System.out.print("Giriş Ders Notunu 0-100 arası giriniz: ");
		double girisNot = girdi.nextDouble();
		
		System.out.print("Programlama Ders Notunu 0-100 arası giriniz: ");
		double programlamaNot = girdi.nextDouble();
		
		if (mathNot<fizikNot && mathNot<girisNot && mathNot<programlamaNot) {
			dusukNot = mathNot;
		}
		else if(fizikNot<mathNot && fizikNot<girisNot && fizikNot<programlamaNot) {
			dusukNot = fizikNot;
		}
		else if(girisNot<mathNot && girisNot<fizikNot && girisNot<programlamaNot) {
			dusukNot = girisNot;
		}
		else {
			dusukNot = programlamaNot;
		}
		
		if (mathNot>fizikNot && mathNot>girisNot && mathNot>programlamaNot) {
			yuksekNot = mathNot;
		}
		else if(fizikNot>mathNot && fizikNot>girisNot && fizikNot>programlamaNot) {
			yuksekNot = fizikNot;
		}
		else if(girisNot>mathNot && girisNot>fizikNot && girisNot>programlamaNot) {
			yuksekNot = girisNot;
		}
		else {
			yuksekNot = programlamaNot;
		}
		
		double avarage = (fizikNot + mathNot + girisNot + programlamaNot)/4;
		
		if (avarage >= 70) {
			System.out.println("ortalama Başarılı "+avarage);
		}
		else {
			System.out.println("ortalama Başarısız "+avarage);
		}
		
		System.out.println("Düşük Not :"+ dusukNot);
		System.out.println("Yüksek Not :"+ yuksekNot);
	}

}
