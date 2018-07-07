package arraypackage;

import java.util.Arrays;

public class ArrayWithSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arrayLn = new long[5];
		String[] arrayStr = new String[5];

		arrayLn[0] = 42;
		arrayLn[1] = 4;
		arrayLn[2] = 15;
		arrayLn[3] = 9;
		arrayLn[4] = 14;

		arrayStr[0] = "Halil";
		arrayStr[1] = "Talha";
		arrayStr[2] = "Yusuf";
		arrayStr[3] = "Halit";
		arrayStr[4] = "Ali";

		for (long ln : arrayLn) {
			System.out.print(ln + " ");
		}
		System.out.println();

		for (String str : arrayStr) {
			System.out.print(str + " ");
		}
		System.out.println();

		Arrays.sort(arrayLn); //***********
		Arrays.sort(arrayStr); //***********
		
		for (long ln : arrayLn) {
			System.out.print(ln + " ");
		}
		System.out.println();

		for (String str : arrayStr) {
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.print(Arrays.toString(arrayLn));
		System.out.println();
		System.out.print(Arrays.toString(arrayStr));

		System.out.println();
		String s = Arrays.toString(arrayStr);
		System.out.println(s.charAt(0));
		
		Arrays.binarySearch(arrayLn, 9);
		System.out.println(Arrays.binarySearch(arrayLn, 4));
	
	}

}
