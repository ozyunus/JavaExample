package Lab6;

public class Lab6_30 {

	public static void main(String[] args) {
		int[] myArray = {3,4,5,6,7,8};
		int temp=-1;
		int smallToLarge=0;
		int largeToSmall=0;
		int mix=0;
		
		
		for (int i=0; i<myArray.length; i++) {
		
			if (temp<myArray[i]) {
				temp =myArray[i];
				smallToLarge++;
			}
			else if(temp>myArray[i]) {
				temp =myArray[i];
				largeToSmall++;
			}
			else {
				mix++;
				System.out.println("mix");
				break;
			}
		}
		if (mix>0) {
			System.out.println("Sırasız");
		}
		else if(smallToLarge==myArray.length) {
			System.out.println("Küçükten büyüğe");
		}
		else if(largeToSmall==myArray.length) {
			System.out.println("Büyükten küçüğe");
		}
	}

}

// algoritmada bi hata yapıyorum. Küçükten büyüğe mi diye bakıyor. Mix i de bazen buluyor ama büyükten küçüğe bakmıyor. bi de çalışırken hata basıoyr