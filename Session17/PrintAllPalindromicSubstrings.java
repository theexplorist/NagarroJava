package Session17;

public class PrintAllPalindromicSubstrings {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "nitin";

		
		int n = str.length();
		for (int si = 0; si < n; si++) {
			for (int ei = si + 1; ei <= n; ei++) {
				String pal = str.substring(si, ei);//new
				
				//agar pal is actually a palindrome then only print pal otherwise not
				if(isPalindrome(pal)) {
					System.out.println(pal);
				}
				
			}
		}
	}

}
