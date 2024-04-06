package ApnaCollege;

import java.util.Scanner;

public class Arraysquestions {

	public static void main(String args[]) {

		// Find max and min in arrays!

		int[] values = new int[5];

		System.out.println("Enter five values: ");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			values[i] = input.nextInt();
		}
//
//		int min = values[0];
//		int max = values[0];
//
//		for (int i = 0; i < 5; i++) {
//
//			if (values[i] > max) {
//				max = values[i];
//			}
//
//			if (values[i] < min) {
//				min = values[i];
//			}
//		}
//
//		System.out.println("The largest values is: " + max);
//		System.out.println("The smallest values is: " + min);
//		

		//////////////////////////////////////////////////////////////

		// MAKING AN ARRAY IN ASCENDING ORDER::::
		int flag = 0;
		for (int n = 0; n < 4; n++) {
			for (int i = 0; i < 4; i++) {

				if (values[i] > values[i + 1]) {
					flag = values[i + 1];
					values[i + 1] = values[i];
					values[i] = flag;
				}
			}
		}
		System.out.print("The series in asceding is: ");
		for (int m = 0; m < 5; m++) {
			System.out.print(values[m] + " ");

			// to check the line is or not:::::

			//for (int i = 0; i < numbers.length - 1; i++) { // NOTICE numbers.length - 1 as termination condition
				//if (numbers[i] > numbers[i + 1]) { // This is the condition for descending order
		//			isAscending = false;
		//		}
		//	}
//
		//	if (isAscending) {
				//System.out.println("The array is sorted in ascending order");
		//	} else {
				//System.out.println("The array is not sorted in ascending order");
		//	}

	//	}

	}
}
