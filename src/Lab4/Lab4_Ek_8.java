package Lab4;

import java.util.Scanner;

public class Lab4_Ek_8 {

	public static void main(String[] args) {
		int num1= 1;
		int num2= 1;
		int num3;
		boolean ilk =true;
		
		for (int i =2; i<5; i++) {
			for (int j =0; j<=i*2; j+=2){
				if(ilk ==true) {
					System.out.println(0);
					System.out.println(1+" "+1);
					ilk = false;
				}
				num3 = num1+num2;
				System.out.print(num3+ " ");
				num1= num2;
				num2= num3;
			}
			System.out.println();

		}
	}

}
