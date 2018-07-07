package arraypackage;

public class PrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringPrinter sp = new StringPrinter();

		String[] strArr = { "Halil", "Talha", "Ali", "Halit" };

		sp.printAllArrayString(strArr);

		sp.printAllString("Halil", "Talha", "Ali", "Halit");
		sp.printAllString("Halil", "Ali", "Halit");

	}

}
