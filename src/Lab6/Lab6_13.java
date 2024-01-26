package Lab6;

public class Lab6_13 {

	public static void main(String[] args) {
		int[] myArray = {2000,7888984,5,6,-7,8,98789,-19,3};
		int bigNumber=0;
		int bigBigNumber=0;
		
		for (int i=0; i<myArray.length; i++) {
			if (bigNumber<=myArray[i]) {
				bigNumber=myArray[i];
			}
			if (bigNumber>=bigBigNumber) {
				int newValue = bigBigNumber;
				bigBigNumber = bigNumber;
				bigNumber = newValue;
			}
		}
		System.out.println("Büyük sayı : "+bigNumber);
		System.out.println("En büyük sayı : "+bigBigNumber);
	}

}

