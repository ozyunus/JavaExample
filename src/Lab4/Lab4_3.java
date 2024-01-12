package Lab4;

public class Lab4_3 {

	public static void main(String[] args) {
		int total = 0;
		
		for (int i=100; i<200; i++) {
			if(i%9==0) {
				total+=i;
				System.out.println(i);
			}
		}
		System.out.println("Sayılar Toplamı: "+total);
	}
}
