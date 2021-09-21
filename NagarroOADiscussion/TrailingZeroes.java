package NagarroOADiscussion;

public class TrailingZeroes {

	public static int trailingZeroes(int n) {
		int result = 0;
		for (int i = 5; n / i > 0; i *= 5) {
			result += (n / i);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(trailingZeroes(28));
	}

}
