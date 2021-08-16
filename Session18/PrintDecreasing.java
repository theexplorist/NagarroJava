package Session18;

public class PrintDecreasing {

	private static void printDec(int n) {
		// TODO Auto-generated method stub

		if(n == 0) {
			return;
		}
		System.out.println(n);
		printDec(n - 1);
		//return;
	}
	
	private static void printInc(int n) {
		// TODO Auto-generated method stub

		if(n == 0) {
			return;
		}
		System.out.println(n);
		printInc(n - 1);
		System.out.println(n);
		
		//return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printInc(5);
	}

}
