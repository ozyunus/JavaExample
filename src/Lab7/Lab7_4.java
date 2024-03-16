package Lab7;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Lab7_4 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Dairenin yarı çapını giriniz: ");
		double r = inputScanner.nextDouble();
		
		daire(r);
		inputScanner.close();
	}
	public static void daire(double r) {
		double pi = 3.1415f;
		double result = pi*(r*r);
		
		System.out.println(result);
	}
}
