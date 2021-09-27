package StackQps1;

import java.util.Stack;

public class FormMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "IDIIIIDD";
		
		Stack<Integer> stack = new Stack<>();
		for(int i = 0;  i <= st.length(); i++) {
			stack.push(i + 1);
			
			if(i == st.length() || st.charAt(i) == 'I') {
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());
				}
			}
		}
	}

}
