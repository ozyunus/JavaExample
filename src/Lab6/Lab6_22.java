package Lab6;

public class Lab6_22 {

	public static void main(String[] args) {
		int [] myArrray1 = {-4, 0, 6, 4, 77, 90, 06, 5};
		int [] myArrray2 = {4, 2, 10, 16, 43, 7, 9, 6, -5};
		int sifiraYakin=55;
		int firsNumber=0;
		int secondNumber=0;
		
		for (int i=0; i<myArrray1.length; i++) {
			for (int j=0; j<myArrray2.length; j++) {
				if (myArrray1[i]+myArrray2[j]<0) {
					sifiraYakin = myArrray1[i]+myArrray2[j];
					firsNumber = myArrray1[i];
					secondNumber = myArrray2[j];
				}

			}					

		}
		System.out.println("Beklenen çıktı: "+firsNumber+" ve "+secondNumber);


	}

}

// sıfıra nasıl yakın yapacağımı kestiremedim. O dan küçük yapınca da negatifleri çekiyor.
