package StackQps1;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val = 4;
		
		for(int i = 0; i < 5; i++) {
			
			if(val % 2 == 0) {
				continue;
			}
			
			System.out.println("Hello!");
		}
	}

}
