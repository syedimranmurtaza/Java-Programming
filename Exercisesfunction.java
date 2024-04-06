package ApnaCollege;

import java.util.Scanner;

public class Exercisesfunction {
	
	int positiveCount =0;
		int negativeCount =0;
		int zeroCount =0;
		
	public void displayPosiNeg(int n){
			
		
		if (n>0) {
			positiveCounter(1);
		}
		else if (n<0) {
			negativeCounter(1);
		}
		else {
			zeroCounter(1);
		}
		
	}
	
	public void positiveCounter (int a) {
		positiveCount = positiveCount +1;
	}
	
	public void negativeCounter(int b) {
		negativeCount = negativeCount +1;
	}
	
	public void zeroCounter(int c) {
		zeroCount = zeroCount +1;
	}
	
	public void printWala() {
		System.out.println("The total postive numbers are: "+ positiveCount);
		System.out.println("The total negative numbers are: "+ negativeCount);
		System.out.println("The total zero numbers are: "+ zeroCount);
	}
	
	public static void main (String[] args) {

		Scanner input = new Scanner (System.in);
		Exercisesfunction m = new Exercisesfunction();
			
		for (int i=1; i!=0; i++ ) {
		
		System.out.println("Press 'L' to exist!");
		System.out.println("Enter the number: ");
		int n = input.nextInt();
		
		if (n==100) {
			System.out.println("Loop Breaks!");
			break;
		}
		
		m.displayPosiNeg(n);
	}
		
		m.printWala();
		
}



}

