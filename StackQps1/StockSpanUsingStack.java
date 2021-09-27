package StackQps1;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 4, 3, 5 };

		int[] span = new int[arr.length];
		span[0] = 1;

		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int ci = 1; ci < arr.length; ci++) {
			while(!st.isEmpty() && arr[st.peek()] < arr[ci]) {
				st.pop();
			}
			span[ci] = st.isEmpty() ? ci + 1 : ci - st.peek();
			st.push(ci);
		}
		
		System.out.println(Arrays.toString(span));
	}

}
