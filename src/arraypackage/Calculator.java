package arraypackage;

public class Calculator {

	public void addMultipleNumbers(int... numbers) {

		// System.out.println(numbers[0]);
		// System.out.println(numbers[1]);
		// System.out.println(numbers[2]);

		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");

		}
		System.out.println();
	}

	public void printAllArrayNumbers(int[] numbers) {
			
			for (int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i]+" ");
			}
		System.out.println();
		}
}
