package Lab7;

import java.util.Scanner;

public class Lab7_19 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int num = inputScanner.nextInt();
		
		tekHaneyiTopla(num);
		
		inputScanner.close();
	}
	
	public static void tekHaneyiTopla(int num) {
		int kalan=0;
		int total=0;
		
		while (num>0) {
			kalan=num%10;
			if(kalan%2==1) {
				total+=kalan;
			}
			num-=kalan;
			num /=10;
		}		
		System.out.println("Toplam: "+total);
	}

}
