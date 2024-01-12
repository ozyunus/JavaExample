package Lab4;

public class Bilesik {

	public static void main(String[] args) {
		int a =25; 
		double t =0.07f;
		int n =60;
		double total =0;
		
		total += a*Math.pow((1+t), n);
		System.out.println(n+" günde \n"+total+" abone olması gerekir");
		
	}

}
