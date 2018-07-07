package Multi_DimensionalArray;

import java.util.Arrays;

public class PizzaSlices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] pizza = { { "Mushroom", "Black Olive", "Green Pepper" }, { "Spinach", "Green Pepper", "Mushroom" },
				{ "Black Olive", "Black Olive", "Spinach" }, { "Banana Pepper", "Mushroom", "Red Pepper" } };

		// for (int i = 0; i < pizza.length; i++) {
		// for (int j = 0; j < pizza[i].length; j++) {
		// System.out.print(pizza[i][j]+" ");
		// }
		// System.out.println();
		// }

		LABEL: 
		for (int i = 0; i < pizza.length; i++) {
			System.out.print("Slice " + (i + 1) + "--------->");
			String[] eachSlice = pizza[i];

			for (int j = 0; j < eachSlice.length; j++) {

				if (eachSlice[j].equals("Black Olive")) {
					continue;
				}
				if (eachSlice[j].equals("Banana Pepper")) {
					break LABEL;
				}
				System.out.print(eachSlice[j] + " ");
			}
			System.out.println();
		}

	}

}
