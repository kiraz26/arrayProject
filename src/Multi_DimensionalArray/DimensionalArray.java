package Multi_DimensionalArray;

import java.util.Arrays;

public class DimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oneD;
		long[][] twoD;
		double[][][] threeD;

		oneD = new int[5];
		twoD = new long[5][2];
		threeD = new double[3][2][2];

		oneD[0] = 12;
		oneD[1] = 23;
		oneD[2] = 27;
		oneD[3] = 11;
		oneD[4] = 8;
		System.out.println(Arrays.toString(oneD));

		twoD[2][0] = 100;
		twoD[4][1] = 200;
		twoD[3] = new long[] { 300, 400 };
		System.out.println(Arrays.deepToString(twoD));

		// 2nd sheet 2rd 1st column
		threeD[1][1][0] = 1234.56;
		threeD[0][1][1] = 2357.89;

		System.out.println(Arrays.deepToString(threeD));

		// Way to create array in one line with all it's value

		// oneD = {12,31,2312};
		int[][] twoDD = { { 12, 31, 2312 }, { 123, 32, 12, 3 } };

		int[][] twoDD2 = { { 12, 3112312, 2312 }, { 123, 32, 12, 3 } };

		int[][][] threeDD = { twoDD, twoDD2 };

		int[][][] threeDD2 = { { { 1, 2, 12 }, { 12, 434 } }, { { 12, 333 }, { 0 } } };

		System.out.println(threeDD[1][1][1]); // 32
		System.out.println(threeDD2[1][1][0]); // 0

	}

}
