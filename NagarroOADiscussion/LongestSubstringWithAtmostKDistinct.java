package NagarroOADiscussion;

public class LongestSubstringWithAtmostKDistinct {

	public static int lengthOfLongestSubstringKDistinct(String s, int k) {

		int l = 0, r = 0;
		int maxL = 0, count = 0;
		int[] freq = new int[128];
		while(r < s.length()) {
			
			if(freq[s.charAt(r)] == 0) {
				count++;
			}
			
			freq[s.charAt(r)]++;
			
			while(count > k) {
				char ccL = s.charAt(l);
				freq[ccL]--;
				l++;
				
				if(freq[ccL] == 0) {
					count--;
				}
			}
			maxL = Math.max(maxL, r - l + 1);
			r++;
		}
		return maxL;
	}
	
	public static void main(String[] args) {
		
		String str = "abaccc";//k - 2, a -  1, r - 1 ,t - 1, i - 1
		System.out.println(lengthOfLongestSubstringKDistinct(str, 2));
		
		//System.out.println(ch);
	}
}
