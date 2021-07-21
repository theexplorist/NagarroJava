package Session7;

public class FunctionDemo {

	public static void addition() {
		int a = 10;
		int b = 20;
		
		int c = a + b;
		System.out.println(c);
		subtraction();
	}
	
	private static void subtraction() {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		
		int c = a - b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		//System.out.println(a); //local vars of other funcs cannot be accessed
		addition();
		subtraction();
	}
}
