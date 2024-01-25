package Lab6;

public class Lab6_5 {

	public static void main(String[] args) {
		int[]myArray = {0,5,6,-5,-3,-56,34,556};
		int count = 0;
		
		for (int i=0; i<myArray.length; i++) {
			if (myArray[i]%2==0) {
				
			}
			else {
				count++;
			}
		}
		System.out.println("Toplam Tek sayı: "+count);
	}
}

