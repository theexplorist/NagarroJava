package StackQps2;

import java.util.Stack;

public class NextSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ht = {1, 5, 6, 2, 3};
		
		Stack<Integer> st = new Stack<>();
		st.push(0);
		int[] nse = new int[ht.length];
		for(int curr = 1; curr < ht.length; curr++) {
			
			while(!st.isEmpty() && ht[st.peek()] > ht[curr]) {
				//System.out.println("NGE of " + ht[st.pop()] + " is " + ht[curr]);
				nse[st.pop()] = ht[curr];
			}
			
			st.push(curr);
		}
		
		while(!st.isEmpty()) {
			nse[st.pop()] = -1;
			//System.out.println("NGE of " + ht[st.pop()] + " is " + -1);
		}
		for(int i = 0; i < nse.length; i++) {
			System.out.println(ht[i] + " -> " + nse[i]);
		}
	}

}
