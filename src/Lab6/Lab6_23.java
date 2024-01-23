package Lab6;

import java.util.Arrays;

public class Lab6_23 {

	public static void main(String[] args) {
		int [] myArray = {3,5,77,8,9,33,6};
		int temp;

		for (int i=0; i<myArray.length; i++) {
			if (myArray[i]>myArray[i+1]) {
				temp = myArray[i+1];
				myArray[i+1]= myArray[i];
				myArray[i] = temp;
			}
		}
		System.out.println(Arrays.toString(myArray));
	}

}

// burada neyi yanlış yapıyorum da liste boyutundan fazla elemana sahip oluyorum onu anlayamadım.