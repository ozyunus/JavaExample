package Lab6;

public class Lab6_15 {

	public static void main(String[] args) {
		int[] myArray = {2,3,5,7,8,9,11,12,14};
		
		for (int i=0; i<myArray.length; i++) {
			boolean isPrime = true;
			for (int j=2; j<myArray[i]; j++) {
				
				if(myArray[i]%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(myArray[i]+" asal sayıdır.");
			}
			}
	}

}

