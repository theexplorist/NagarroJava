package TimeComplexityQuestions;

public class FastExponentiation {

	private static int power(int x, int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 1;
		}
		int recAns = power(x, n / 2);
		
		int myAns = 1;
		if(n % 2 == 0) {
			myAns = recAns * recAns;
		} else {
			myAns = recAns * recAns * x;
		}

		
		return myAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 8));
	}

}
