package Lab5;

import java.util.Scanner;

public class Lab5_1 {

	public static void main(String[] args) {

		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir ay giriniz:");
		int mounth = inputScanner.nextInt();
		
		switch (mounth) {
		case 1: {
			System.out.println("Ocak Ayı");
			break;
		}
		
		case 2: {
			System.out.println("Şubat Ayı");
			break;
		}
		
		case 3: {
			System.out.println("Mart Ayı");
			break;
		}
		
		case 4: {
			System.out.println("Nisan Ayı");
			break;
		}
		
		case 5: {
			System.out.println("Mayıs Ayı");
			break;
		}
		
		case 6: {
			System.out.println("Haziran Ayı");
			break;
		}
		
		case 7: {
			System.out.println("Temmuz Ayı");
			break;
		}
		
		case 8: {
			System.out.println("Ağustos Ayı");
			break;
		}
		
		case 9: {
			System.out.println("Eylül Ayı");
			break;
		}
		
		case 10: {
			System.out.println("Ekim Ayı");
			break;
		}
		
		case 11: {
			System.out.println("Kasım Ayı");
			break;
		}
		
		case 12: {
			System.out.println("Aralık Ayı");
			break;
		}
		
		default:
			System.out.print("Yanlış veri girdiniz");
			break;
		}

	}

}
