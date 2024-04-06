package ApnaCollege;

import java.util.Scanner;

public class FiboSeries {

	public void Fiboconni(int n) {

		int a = 0;
		int b = 1;

		System.out.print("Here is the series: " + a + " " + b);

		for (int i = 0; i <= n; i++) {

			int c = a + b;
			a = b;
			b = c;

			System.out.print(" " + c);
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = input.nextInt();

		FiboSeries m = new FiboSeries();

		m.Fiboconni(n);

	}
}
