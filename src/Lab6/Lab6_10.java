package Lab6;

public class Lab6_10 {

	public static void main(String[] args) {
		int[] myArray1 = {0,5,4,9,2,4,5};
		int[] myArray2 = {0,5,4,9,2,4,5};
		boolean esit = true;
		
		if(myArray1.length==myArray2.length) {
			for (int i=0; i<myArray1.length; i++) {
				if(myArray1[i]==myArray2[i]) {
				   continue;
				   
				}
				else {
					System.out.println("Bu iki dizi birebir aynı değil!");
					esit=false;
					break;
				}
			}
		}
		else {
			System.out.println("Dizi uzunlukları eşit değil!");
			esit=false;
		}
		if (esit) {
			System.out.println("Diziler eşit");
		}
		
	}

}

// Buna bakıcam ya da beraber bakarız 
