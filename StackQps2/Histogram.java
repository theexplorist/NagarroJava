package StackQps2;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ht = { 2, 1, 5, 6, 2, 3 };
		Stack<Integer> st = new Stack<>();
		int[] pse = new int[ht.length];
		pse[0] = -1;
		st.push(0);

		for (int curr = 1; curr < ht.length; curr++) {
			while (!st.isEmpty() && ht[st.peek()] >= ht[curr]) {
				st.pop();
			}

			if (!st.isEmpty()) {
				pse[curr] = st.peek();
			} else {
				pse[curr] = -1;
			}

			st.push(curr);
		}

		for (int i = 0; i < pse.length; i++) {
			System.out.println(ht[i] + " -> " + pse[i]);
		}

		st = new Stack<>();
		st.push(0);
		int[] nse = new int[ht.length];
		for (int curr = 1; curr < ht.length; curr++) {

			while (!st.isEmpty() && ht[st.peek()] > ht[curr]) {
				// System.out.println("NGE of " + ht[st.pop()] + " is " + ht[curr]);
				nse[st.pop()] = curr;
			}

			st.push(curr);
		}

		while (!st.isEmpty()) {
			nse[st.pop()] = ht.length;
			// System.out.println("NGE of " + ht[st.pop()] + " is " + -1);
		}
		for (int i = 0; i < nse.length; i++) {
			System.out.println(ht[i] + " -> " + nse[i]);
		}

		int maxArea = Integer.MIN_VALUE;
		for(int curr = 0; curr < ht.length; curr++) {
			int width = nse[curr] - pse[curr] - 1;
			int area = width * ht[curr];
			maxArea = Math.max(maxArea, area);
		}
		
		System.out.println(maxArea);
	}

}
