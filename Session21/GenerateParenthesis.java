package Session21;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {


	private static void genParen(String comb, int n, int oc, int cc) {
		// TODO Auto-generated method stub

		if (oc == n && cc == n) {
			System.out.println(comb);
			return;
		}
		if (oc < n) {
			// put open bracket
			genParen(comb + '(', n, oc + 1, cc);
		}

		if (oc > cc) {
			// put close bracket
			genParen(comb + ')', n, oc, cc + 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		genParen("", 4, 0, 0);
	}

}
