package Lab7;

import javax.xml.validation.Validator;

public class Lab7_23 {

	public static void main(String[] args) {
		int num=980787234;
		
		int big=buyukSayiDondur(num);
		System.out.println("Büyük Sayı: "+big);
	}
	public static int buyukSayiDondur(int num) {
		int max=0;
		int value=0;
		int new1=0;
		
		value=num%10;
		num -= value;
		while(num>0) {
		    new1= num%10;
			num/=10;
			if(new1>max) {
				max=new1;
			}

		}
		if(value>max) 
		{
			max=value;
		}
		
		return max;
	}
}
