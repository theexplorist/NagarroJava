package StackQps2;

import java.util.Stack;

public class PreviousGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ht = {31, 14, 22, 20, 50};
		
		Stack<Integer> st = new Stack<>();
		int[] pge = new int[ht.length];
		pge[0] = -1;
		st.push(0);
		
		for(int curr = 1; curr < ht.length; curr++) {
			while(!st.isEmpty() && ht[st.peek()] <= ht[curr]) {
				st.pop();
			}
			
			if(!st.isEmpty()) {
				pge[curr] = ht[st.peek()];
			} else {
				pge[curr] = -1;
			}
			
			st.push(curr);
		}
		
		for(int i = 0; i < pge.length; i++) {
			System.out.println(ht[i] + " -> " + pge[i]);
		}
	}

}
