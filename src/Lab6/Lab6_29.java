package Lab6;

import java.util.Arrays;

public class Lab6_29 {

	public static void main(String[] args) {
		int[] myArray = {0, 1, 0, 1, 1, 0, 1, 0, 1, 0};

        System.out.print("Başlangıç Dizisi: ");
        System.out.println(Arrays.toString(myArray));

        int leftIndex = 0;
        int rightIndex = myArray.length - 1;

        while (leftIndex < rightIndex) {
            while (myArray[leftIndex] == 0 && leftIndex < rightIndex) {
                leftIndex++;
            }

            while (myArray[rightIndex] == 1 && leftIndex < rightIndex) {
                rightIndex--;
            }

            if (leftIndex < rightIndex) {
                int temp = myArray[leftIndex];
                myArray[leftIndex] = myArray[rightIndex];
                myArray[rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            }
        }

        System.out.print("Güncellenmiş Dizi: ");
        System.out.println(Arrays.toString(myArray));
    }
}