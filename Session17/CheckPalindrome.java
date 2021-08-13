package Session17;

public class CheckPalindrome {

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		
		//two pointers
		int l = 0, r = str.length() - 1;
		
		while(l < r) {
			if(str.charAt(l) != str.charAt(r)) {
				return false;
			}
			
			l++;
			r--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome("nitin"));
	}

}
