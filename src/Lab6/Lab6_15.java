package Lab6;

public class Lab6_15 {

	public static void main(String[] args) {
		int[] myArray = {2,3,5,7,8,9,11,12,14};
		int asal =0;
		boolean isPrime = true;
		
		for (int i=2; i<myArray.length; i++) {
			for (int j=2; j<=i; j++) {
				if(myArray[i]%j==0)
				{
					isPrime=false;
					break;
				}
				else {
					asal = myArray[i];
				}
			}
			if (isPrime) {
				System.out.println(asal+" asal sayıdır.");
			}
			}
	}

}

// normalde bu haliyle 3 ü de göstermesini bekliyordum ama göstermiyor. Arraydaki indeke ait sayı kadar dönmüyor lengtih kadar dönüyor bakalım