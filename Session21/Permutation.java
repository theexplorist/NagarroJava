package Session21;

public class Permutation {

	private static void printPerm(String inp, String perm) {
		// TODO Auto-generated method stub

		if(inp.length() == 0) {
			System.out.println(perm);
			return;
		}
		for(int ci = 0; ci < inp.length(); ci++) {
			char cith = inp.charAt(ci);
			String leftInp = inp.substring(0, ci) + inp.substring(ci + 1);
			printPerm(leftInp, perm + cith);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPerm("abcd", "");
	}

}
