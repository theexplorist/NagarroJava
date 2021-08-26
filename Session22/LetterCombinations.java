package Session22;

public class LetterCombinations {

	private static String getString(char cc) {
		// TODO Auto-generated method stub

		if (cc == '2') {
			return "abc";
		} else if (cc == '3') {
			return "def";
		} else if (cc == '4') {
			return "ghi";
		} else if (cc == '5') {
			return "jkl";
		} else if (cc == '6') {
			return "mno";
		} else if (cc == '7') {
			return "pqrs";
		} else if (cc == '8') {
			return "tuv";
		} else if (cc == '9') {
			return "wxyz";
		}
		return "";
	}

	// inp - 23
	private static void printCombinations(String inp, String out) {
		// TODO Auto-generated method stub

		if (inp.length() == 0) {
			System.out.println(out);
			return;
		}
		char cc0th = inp.charAt(0); // 2
		String mappedString = getString(cc0th); // abc

		for (int i = 0; i < mappedString.length(); i++) {
			//inp -> "23"
			//String leftInp = inp.substring(1);
			printCombinations(inp.substring(1), out + mappedString.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printCombinations("234", "");
	}

}
