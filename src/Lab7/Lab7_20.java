package Lab7;

import java.util.Scanner;

public class Lab7_20 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("1.Kenar uzunluğunu giriniz: ");
		int firstCorner = inputScanner.nextInt();
		
		System.out.println("2.Kenar uzunluğunu giriniz: ");
		int secondCorner = inputScanner.nextInt();
		
		System.out.println("3.Kenar uzunluğunu giriniz: ");
		int thirdstCorner = inputScanner.nextInt();
		
		inputScanner.close();
		
		int value =ucgenKontrolEt(firstCorner, secondCorner, thirdstCorner);
		System.out.println(value);
	
	}
	public static int ucgenKontrolEt(int firstCorner, int secondCorner, int thirdstCorner) {
		int value=0;
		int count=0;
		
		if(firstCorner+secondCorner>thirdstCorner) {
			count++;
		}
		else if(firstCorner+secondCorner>thirdstCorner && 
				secondCorner+thirdstCorner>firstCorner && 
				firstCorner+thirdstCorner>secondCorner ){
			count++;
		}

		if(count>0) {
			value=1;
		}
		else {
			value=-1;
		}
		return value;
	}

}
