package Session17;

public class Jumbles {

	private static boolean sol(String s1, String s2) {
		// TODO Auto-generated method stub

		if(s1.length() != s2.length()) {
			return false;
		}
		int[] freqS1 = new int[26];
		//int[] freqS2 = new int[26];
		
//		for(int e : freq) {
//			System.out.println(e  + " ");
//		}
		
//		int a = 'd' - 'a'; //index -> 3
//		a = 'a' - 'a'; // index -> 0
//		a = 'c' - 'a'; //index -> 2
//		System.out.println(a);
		
//	    char c = 'z';
//		System.out.println((int)c);
		for(int i = 0; i < s1.length(); i++) {
			char cc1 = s1.charAt(i); //'h'
			int index1 = cc1 - 'a';
			
			freqS1[index1]++;
			
			char cc2 = s2.charAt(i);
			int index2 = cc2 - 'a';
			freqS1[index2]--;
			//freqS2[index2]++;
		}
		
		for(int e : freqS1) {
			System.out.print(e + " ");
		}
//		System.out.println();
//		for(int e : freqS2) {
//			System.out.print(e + " ");
//		}
		
//		for(int i = 0; i < 26; i++) {
//			
//			//jaise hi kahin equal ni mili false
//			if(freqS1[i] != freqS2[i]) {
//				return false;
//			}
//		}
		//return false;
		
		for(int e : freqS1) {
			if(e != 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		String s2 = "holle";
		
		System.out.println(sol(s1, s2));
	}

}
