package Multi_DimensionalArray;

import java.util.Arrays;

public class UsingNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ducks = { 1, 2, 3, 4, 123 };
		for (int i = 0; i < ducks.length; i++) {
			System.out.print(ducks[i] + " ");
		}
		System.out.println();
		for (int eachDuck : ducks) {
			System.out.print(eachDuck + " ");
		}
		System.out.println();

		int[][] Ponds = { { 1, 23, 3 }, { 11, 34, 33, 5, 6 }, { 19 } };

		for (int i = 0; i < Ponds.length; i++) {

			// int[] eachPond = Ponds[i];
			// System.out.println(Arrays.toString(Ponds[i]));
			// System.out.println(Arrays.toString(eachPond));

			// Add 20 to the #1 duck number
			// eachPond[0] = eachPond[0] + 20;

			// for (int j = 0; j < eachPond.length; j++) {
			// System.out.print(eachPond[j]+" ");
			// }

			for (int j = 0; j < Ponds[i].length; j++) {
				System.out.print(Ponds[i][j] + " ");
				// System.out.println();
			}
			// System.out.println(Arrays.deepToString(Ponds));

		}
		
	}
}
