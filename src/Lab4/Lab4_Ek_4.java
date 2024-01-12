package Lab4;

public class Lab4_Ek_4 {

	public static void main(String[] args) {
		int pay =1;
		double payda=0;
		double total=1;
		double x =1;
		
		for (int i=1; i<100000; i++) {
			
			for (int j=1; j<=i; j++) {
				x *=j;		
			}
			payda = x;
			x=1;
			double e = pay /(double)payda;
			total += e;
		}
		System.out.println(total);

	}

}
