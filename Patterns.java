package ApnaCollege;

import java.util.Scanner;

public class Patterns {

	private static final boolean True = false;

	public static void main(String[] args) {

		// SOLID RECTANGLE

//		
//		for (int a=0; a<4; a++) {
//			
//			for (int i=0; i<5; i++) {  //NESTED LOOP
//				System.out.print("*");
//			}
//		
//			System.out.println();
//		}

////////////////////////////////////////////////////////////////////////////////

		// HALLOW RECTANGLE:::::

//		Scanner input = new Scanner (System.in);
//		System.out.println("Enter a: ");
//		int a= input.nextInt();
//		System.out.println("Enter a: ");
//		int b= input.nextInt();

//		for (int i = 1; i<=a; i++) {
//			
//			for (int j=1; j<=b; j++) {
//				
//				if (i ==1 || j==1 || i==a || j==b ) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		/////////////////////////////////////////////////////////////////////

		// HALF PYRAMID:::::::::::::::
//		
//		Scanner input = new Scanner (System.in);
//		System.out.println("Enter a: ");
//		int a= input.nextInt();
//		System.out.println("Enter b: ");
//		int b= input.nextInt();
//		
//		for (int i=1; i<=a; i++) {
//			
//			for (int j=1; j<=i; j++) {
//				
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}

		// INVERTED::::

//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a: ");
//		int a = input.nextInt();
//		System.out.println("Enter b: ");
//		int b = input.nextInt();
//
//		for (int i = 0; i <= a; i++) {
//
//			for (int j = 0; j <= a - i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}
		
		
		///////////////////////////////////////////////////////////////////
		
		//HALF PYRAMIDS WITH NUMBERS:::::::
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a: ");
//		int a = input.nextInt();
//		System.out.println("Enter b: ");
//		int b = input.nextInt();
		
		
//		for (int i =1; i<=a; i++) {
//			
//			for (int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			
//			System.out.println();
//		}
		
		//Inverted Half Pyramid:::::
		
//		for (int i=a; i>=1; i--) {
//			
//			for (int j =1; j<=i; j++ ) {
//				System.out.print(j+ " ");
//			}
//			System.out.println();
//		}
		
		//////////////////////////////////////////////////////////////////////////////////////
		
		//FLOYD'S TRIANGLE:::::
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a: ");
//		int a = input.nextInt();
		
//		int enter =1;
//		
//		for (int i=1; i<=a; i++) {
//			
//			for (int j=1; j<=i; j++) {
//				System.out.print(enter+ " ");
//				enter++;
//			}
//			
//			System.out.println();
//		}
		
		/////////////////////////////////////////////////////////////////////
		
		//0 AND 1 TRIANGLE:::::::::::::::::::::::::::::::::::
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
//		int binary= 1;
		
		for (int i=1; i<=a; i++) {
			
			for (int j =1; j<=i; j++) {
				
				if ((i+j)%2==0) {
				System.out.print("1");
				}
				else {
					System.out.print("0");
					}
				
				
				}
			System.out.println();
		}
//		
		
		
	}
}