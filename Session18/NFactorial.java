package Session18;

public class NFactorial {

	
	//my work while popping stack
	private static int factorial(int n) {
		// TODO Auto-generated method stub

		//Base Case
		if(n == 0 || n == 1) {
			return 1;
		}
		
		//Recursive Calls
		int recAns = factorial(n - 1);
		
		//My work
		int myAns = recAns * n;
		return myAns;
//		return n * factorial(n - 1);
	}
	
	private static int factorial2(int n, int ans) {
		// TODO Auto-generated method stub

		if(n == 0 || n == 1) {
			System.out.println(ans);
			return ans;
		}
		int recAns = factorial2(n - 1, ans * n);
		return recAns;//mera answer bhi rec ka ans
		//return;//khud lagao ya compiler laga dega
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial2(5, 1));
	}

}
