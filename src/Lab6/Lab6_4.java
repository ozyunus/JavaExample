package Lab6;

public class Lab6_4 {

	public static void main(String[] args) {
		int[] myArray = {3,4,5,6,7,8,9,10,1,2};
		int total = 0;
		int count = 0;
		double avarage =0.f;
		
		for (int i=0; i< myArray.length; i++) {
			total += myArray[i];
			count++;
		}
		avarage = total /(double) count;
		System.out.println("Toplam: "+total);
		System.out.println("Ortalama: "+avarage);
	}
}
