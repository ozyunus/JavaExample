package Lab6;

public class Lab6_6 {

	public static void main(String[] args) {
		int[] myArray = {-5,-6,-4343,5,-6,-8,-999};
		int maxValue =myArray[0];
		int minValue =myArray[0];
		
		for (int i=0; i<myArray.length; i++) {
			if (myArray[i]<minValue) {
				minValue = myArray[i];
			}
			else if(myArray[i]>maxValue) {
				maxValue = myArray[i];
			}
		}
		System.out.println("Minimum : "+minValue);
		System.out.println("Maksimum : "+maxValue);
	}
}
