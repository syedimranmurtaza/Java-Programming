package ApnaCollege;

import java.util.Scanner;
public class ArraysClass {
	
	public static void main (String[] args) {
		
		int[] values = new int[5];
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the 5 values: ");
		
		for (int i=0; i<5; i++) {
			
		values[i]= input.nextInt();
		
		}
		
		System.out.println("The series is: ");
		for (int j=0; j<5; j++) {
			System.out.print(values[j]+ " ");
		}
		
		System.out.println();
		System.out.println("Enter the x value: ");
		int x = input.nextInt();
		
		for (int i=0; i<5; i++) {
			if (x==values[i]) {
				System.out.println("The number is on "+i+" position!");
			}
			else if (x!=values[0] && x!=values[1] && x!=values[2] && x!=values[3] && x!=values[4]) {
				System.out.println("Invalid not found!!!!");
			}
		}
	}
}
