package Session21;

public class PalindromicPartitioning {

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub

		// two pointers
		int l = 0, r = str.length() - 1;

		while (l < r) {
			if (str.charAt(l) != str.charAt(r)) {
				return false;
			}

			l++;
			r--;
		}
		return true;
	}

	private static void allPartitions(String inp, String out) {
		// TODO Auto-generated method stub

		if(inp.length() == 0) {
			System.out.println(out);
			return;
		}
		for(int ci = 0; ci < inp.length(); ci++) {
			String partition = inp.substring(0, ci + 1);
			String leftInp = inp.substring(ci + 1);
			if(isPalindrome(partition)) {
			allPartitions(leftInp, out + partition + '|');
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		allPartitions("nitin", "");
	}

}
