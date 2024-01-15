package Lab6;

public class Lab6_13 {

	public static void main(String[] args) {
		int bigNumber=0;
		int bigBigNumber=0;
		int[] myArray = {2,4,5,6,7,8,9,9,3};
		
		for (int i=0; i<myArray.length; i++) {
			if (bigNumber<=myArray[i]) {
				bigNumber=myArray[i];
			}
			if (bigNumber<=bigBigNumber) {
				bigBigNumber = bigNumber;
			}
			else {
				bigBigNumber = bigNumber;
			}
		}
		System.out.println("Büyük sayı : "+bigNumber);
		System.out.println("En büyük sayı : "+bigBigNumber);
	}

}


// Burada algoritmayı tam kuramadım.Başlangıçta 0 değeri verdiğim için sıkıntı çıkıyor.