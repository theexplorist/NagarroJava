package Session19;

public class FibonacciNumber {

	private static int fib(int n) {
		// TODO Auto-generated method stub

		if(n == 0 || n == 1) {
			return n;
		}
		
		//rec ka kaam
		int fibN_1= fib(n - 1);
		int fibN_2 = fib(n - 2);
		
		//mera
		
		int fibN = fibN_1 + fibN_2;
//		int fibN = fib(n - 1) + fib(n - 2);
		return fibN;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fib(4));
	}

}
