package StackQps1;

import java.util.Stack;

public class BalancedParenthesis {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "(){}";
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			char ci = str.charAt(i);
			if(ci == '(' || ci == '[' || ci == '{') {
				st.push(ci);
			} else if(ci == ')' || ci == '}' || ci == ']'){
				if(st.isEmpty()) {
					System.out.println("No");
					return;
				}
				
				char top = st.pop();
				
				if(top == '(' && ci == ')') {
					continue;
				}
				
				if(top == '{' && ci == '}') {
					continue;
				}
				
				if(top == '[' && ci == ']') {
					continue;
				}
				System.out.println("NO");
				return;
			}
		}
		
		if(st.isEmpty()) {
			System.out.println("YEs");
		} else {
			System.out.println("NO");
		}
	}

}
