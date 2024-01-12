package Lab2;

import java.util.Scanner;

public class Lab2_8 {

	public static void main(String[] args) {
		Scanner giris= new Scanner(System.in);
		System.out.print("Birinci değeri giriniz: ");
		int ilkkenar = giris.nextInt();
		
		System.out.print("İkinci değeri giriniz: ");
		int ikincikenar = giris.nextInt();
		
		int ücüncükenar = 180- (ilkkenar + ikincikenar);
		
		System.out.print("Üçüncü Kenar: "+ ücüncükenar);
	}

}
