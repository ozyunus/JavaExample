package Lab6;

import java.util.Arrays;

public class Lab6_25 {

	public static void main(String[] args) {
		
		int[] myArray1= {10, 10, 12, 14, 15, 16, 18, 20, 30};
		int[] myArray2= {15, 13, 11};
		int arrayLengts = myArray1.length + myArray2.length;
		int[] myNewArray = new int [arrayLengts];
		int count=0;
		int j = myArray2.length-1;
		int i=0;
	
		
		while(count<arrayLengts) {
			
			if(-1 == j) {
				myNewArray[count] = myArray1[i];
				i++;
			}
			else if(i == myArray1.length) {
				myNewArray[count] = myArray2[j];
				j--;
			}
			else if( myArray1[i]<myArray2[j]) {
				myNewArray[count]=myArray1[i];
				i++;
				
			}
			else {
				myNewArray[count]=myArray2[j];
				j--;
			}
			count++;
		}
		System.out.println(Arrays.toString(myNewArray));
	} 

}
