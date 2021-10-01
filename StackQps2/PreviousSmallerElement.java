package StackQps2;

import java.util.Stack;

public class PreviousSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ht = { 1, 5, 6, 2, 3, 0 };

		Stack<Integer> st = new Stack<>();
		int[] pse = new int[ht.length];
		pse[0] = -1;
		st.push(0);

		for (int curr = 1; curr < ht.length; curr++) {
			while (!st.isEmpty() && ht[st.peek()] >= ht[curr]) {
				st.pop();
			}

			if (!st.isEmpty()) {
				pse[curr] = ht[st.peek()];
			} else {
				pse[curr] = -1;
			}

			st.push(curr);
		}

		for (int i = 0; i < pse.length; i++) {
			System.out.println(ht[i] + " -> " + pse[i]);
		}
	}

}
