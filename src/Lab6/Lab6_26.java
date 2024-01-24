package Lab6;
import java.util.Scanner;

public class Lab6_26 {

	public static void main(String[] args) {
		int[] myArray = {1, 2, 3, 4, 4, 6};
		int left =0;
		int right =0;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Kesilecek yeri belirtiniz: ");
		int number = inputScanner.nextInt();
		
		if (number>=myArray.length) {
			System.out.println("Dizi eleman sayısından büyük");
		}
		else {
		
		for (int i=0; i<myArray.length; i++) {
			if(i<=number) {
				left += myArray[i];
			}
			else {
				right +=myArray[i];
			}
			
		}
		if (left == right) {
			System.out.println("Dizi "+number+" indeksten itibaren bolunurse sag ve sol taraf birbirine esit olur");
		}
		else {
			System.out.println("Eşit değil!");
		}
		}
		inputScanner.close();
	}
		

}
