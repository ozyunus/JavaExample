package Lab1;
import java.util.*;

public class Lab1_9 {

	public static void main(String[] args) {
		int second;
		
		Scanner girilenYil = new Scanner(System.in);
		System.out.print("Lütfen yıl giriniz: ");
		int year = girilenYil.nextInt();
		
		int oneHour = (60*60);
		int oneYear= (oneHour * 24) * 365 + (6*oneHour);
		second = year * oneYear;
		
		System.out.print(second +" saniyedir.");
	}

}
