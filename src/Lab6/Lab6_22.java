package Lab6;

public class Lab6_22 {

	public static void main(String[] args) {
		int [] myArrray1 = {4, 0, 6, 4, 77, 90, 6};
		int sifiraYakin=myArrray1[0]+myArrray1[1];
		int firsindex=0;
		int secondindex=1;
		
		
		for (int i=0; i<myArrray1.length; i++) {
			for (int j=i+1; j<myArrray1.length; j++) {
				int araToplam = myArrray1[i]+myArrray1[j];
				if (araToplam<0) {
					araToplam *=-1;
				}
				if(araToplam<sifiraYakin) {
					sifiraYakin=araToplam;
					firsindex=i;
					secondindex=j;
				}
				
			}					
		}
		System.out.println("Beklenen çıktı: "+myArrray1[firsindex]+" ve "+myArrray1[secondindex]);
	}
}

// sıfıra nasıl yakın yapacağımı kestiremedim. O dan küçük yapınca da negatifleri çekiyor.
