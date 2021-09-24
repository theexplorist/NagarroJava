package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class InbuiltStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> name = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		
		if(!st.isEmpty())
		st.pop();//EXception
		System.out.println(st.isEmpty());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
		System.out.println(st);
		int poppedValue =  st.pop();
		System.out.println(poppedValue);
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.isEmpty());
		st.search(st);
	}

}
