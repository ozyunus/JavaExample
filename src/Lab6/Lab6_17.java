package Lab6;

public class Lab6_17 {

	public static void main(String[] args) {
			int[] myArray = {2, 4, 1, 9, 2, 6, 1, 7, 8, 9};
			int count=0;
			
			for (int i=0; i<myArray.length; i++) {
				for (int j=0; j<i; j++) {
					if(myArray[i]==myArray[j]) {
						count++;
						System.out.print(myArray[i]+" ");
					}
				}
			}
			if(count==0) {
				System.out.println("Tekrar eden sayı yok");
			}
		}

	}


