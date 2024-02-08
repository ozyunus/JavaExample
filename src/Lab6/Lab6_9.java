package Lab6;

public class Lab6_9 {

	public static void main(String[] args) {
		int[] myArray = {1,7,3,5,5,8,3,7,1};
		int count =0;
		int index = myArray.length-1;
		
		for (int i=0; i<myArray.length/2; i++) {
			
			if(myArray[i]==myArray[index]) {
				index--;
				count++;
			}
			else {
				break;
			}
		}
		if (myArray.length/2==count) {
			System.out.println("polindrom");
		}
		else {
			System.out.println("değil");
		}
	}

}


