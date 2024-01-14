package Lab6;

public class Lab6_3 {

	public static void main(String[] args) {
		int [] myArray = {0,5,2,5,7,9,-4,-4,-7,-5};
		
		for (int i=0; i< myArray.length; i++) {
			if (myArray[i]<0) {
				System.out.println("Negatif sayı: "+myArray[i]);
			}
		}
	}
}
