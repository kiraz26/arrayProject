package arraypackage;

public class StringPrinter {

	public void printAllArrayString(String[] strArr) {

		for (String eachItem : strArr) {
			System.out.print(eachItem + " ");

		}
		System.out.println();
	}

	public void printAllString(String... strVarArgs) {

		for (String eachItem : strVarArgs) {
			System.out.print(eachItem + " ");
		}
		System.out.println();
	}

}
