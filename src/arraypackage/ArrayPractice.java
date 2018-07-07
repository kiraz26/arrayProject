package arraypackage;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = new String[5];
		array[0] = "Halil";
		array[1] = "Talha";
		array[2] = "Ali";
		array[3] = "Halit";
		array[4] = "Yusuf";

		System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]);

		for (String name : array) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		
		
		
	}

}
