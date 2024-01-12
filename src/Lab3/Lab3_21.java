package Lab3;

import java.util.Scanner;

public class Lab3_21 {

	public static void main(String[] args) {

		Scanner girdi = new Scanner(System.in);
		System.out.print("Haftanın kaçıncı gününde olduğunuzu giriniz: ");
		int day = girdi.nextInt();
		
		switch(day) {
		case 1:
			System.out.print("Pazartesi");
			break;
			
		case 2:
			System.out.print("Salı");
			break;
			
		case 3:	
			System.out.print("Çarşamba");
			break;
			
		case 4: 
			System.out.print("Perşembe");
			break;
			
		case 5:
			System.out.print("Cuma");
			break;
			
		case 6:
			System.out.print("Ctesi");
			break;
			
		case 7:
			System.out.print("Pazar");
			break;
			
		default:
			System.out.print("Tanımsız gün seçildi");
			break;
		}
			
		girdi.close();
	}

}
