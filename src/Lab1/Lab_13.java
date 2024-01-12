package Lab1;

import java.util.Scanner;

public class Lab_13 {
	public static void main(String[] args) {
		  float pi = 3.14159f;	
			
		  Scanner giris = new Scanner(System.in);
		  System.out.print("Silindirin Yüksekliğini Giriniz: ");
		  float height = giris.nextFloat();
		  
		  System.out.print("Silindirin yarı çapını Giriniz: ");
		  float r = giris.nextFloat();
		  
		  float environment = pi*(r*r)*height;
		  
		  System.out.println("Silindirin Hacmi: "+environment);
		  giris.close();
	}

}
