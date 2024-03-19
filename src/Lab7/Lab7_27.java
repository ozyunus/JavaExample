package Lab7;

import java.util.Iterator;

public class Lab7_27 {

	public static void main(String[] args) {
		int[]table= {2,3,4,5,6,7,8,9,14};
		
		int big=buyukCarpimiGetir(table);
		System.out.println(big);
	}
	public static int buyukCarpimiGetir(int[]table) {
		int max=0;
		int first=0;
		int second=0;
		int third=0;
		
		for(int i=0; i<table.length-2; i++) {
			first=table[i];
			second=table[i+1];
			third=table[i+2];
			
			int result=first*second*third;
			if(max<result) {
				max=result;
			}
			
		}
		return max;
	}

}
