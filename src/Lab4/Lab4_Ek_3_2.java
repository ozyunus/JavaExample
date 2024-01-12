package Lab4;

public class Lab4_Ek_3_2 {

	public static void main(String[] args) {
		double pi =0;
		int pay =4;
		int payda =1;
		double total =0;
		
		for (int i=0; i<100000; i++) {
			if (i%2==0) {
				pi = pay / (double)payda;
			}
			else {
				pi = pay / (double)payda*-1;
			}
			payda =payda+2;
			total +=pi;
		}
		System.out.println(total);
	}

}
