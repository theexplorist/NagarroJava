package Session8;

public class FunctionReturnType {

	public static int addition(int a, int b) {
		// TODO Auto-generated method stub

		int c = a + b; //8
		return c; //catch(value) thrown
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans = addition(3, 5); //catch(value) caught
		System.out.println(ans); //printed
	}

}
