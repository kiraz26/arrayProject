package arraypackage;

import java.util.Scanner;

public class ArrayLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double[] arrayDouble = new double[4];

		System.out.println("Enter four double number:");
		// arrayDouble[0] = input.nextDouble();
		// arrayDouble[1] = input.nextDouble();
		// arrayDouble[2] = input.nextDouble();
		// arrayDouble[3] = input.nextDouble();

		for (int i = 0; i < arrayDouble.length; i++) {

			arrayDouble[i] = input.nextDouble();

			System.out.print(arrayDouble[i] + " ");

		}

		for (double d : arrayDouble) {
			System.out.print(d + " ");

		}
		System.out.println();

		double total = 0d;
		for (double d : arrayDouble) {
			total = total + d;

		}
		System.out.println("Total = " + total);
	}

}
