package Session19;

public class XPowerN {

	private static int power2(int x, int ans, int n) {
		// TODO Auto-generated method stub

		if(n == 0) {
			System.out.println(ans);
			return ans;
		}
		int recAns = power2(x, ans * x, n - 1);
		return recAns;
	}

	private static int power(int x, int n) {
		// TODO Auto-generated method stub

		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}
		// rec
		int recAns = power(x, n - 1);
		// mera
		int meraAns = x * recAns;

		return meraAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println(power2(2, 1, 2));// 2 ^ 3 -> 8
	}

}
