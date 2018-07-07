package arraypackage;

public class Varargs_Practice {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		c.addMultipleNumbers(1,2,3);
		
		c.addMultipleNumbers(1,2,3, 214533,214534,434,657,3424,23423);

		
		c.printAllArrayNumbers(new int[] {1,2,3});
		
		
	}

}
