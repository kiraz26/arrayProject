package arraypackage;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringImmutable s = new StringImmutable();
		//s.printSomething("learn java");
		new StringImmutable().printSomething("learn java");
		
		///
		String s1= "java ";
		s1.concat("!!!");
		s1.trim();
		s1.substring(2);
		System.out.println(s1);
		
		
		
		
	}
	
	public void printSomething(String str) {
		System.out.println(str);
		
		
	}
	
	
}
