package StackQps2;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ht = {31, 14, 13, 15, 20};
		
		Stack<Integer> st = new Stack<>();
		st.push(0);
		int[] nge = new int[ht.length];
		for(int curr = 1; curr < ht.length; curr++) {
			
			while(!st.isEmpty() && ht[st.peek()] < ht[curr]) {
				//System.out.println("NGE of " + ht[st.pop()] + " is " + ht[curr]);
				nge[st.pop()] = ht[curr];
			}
			
			st.push(curr);
		}
		
		while(!st.isEmpty()) {
			nge[st.pop()] = -1;
			//System.out.println("NGE of " + ht[st.pop()] + " is " + -1);
		}
		for(int i = 0; i < nge.length; i++) {
			System.out.println(ht[i] + " -> " + nge[i]);
		}
	}

}
