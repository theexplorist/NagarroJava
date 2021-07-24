package Session8;

import java.util.Scanner;

public class FunctionWithParams {

	public static void additionParams(int a, int b) { //employee

		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) { //boss
		// TODO Auto-generated method stub

		//System.out.println(a + " " + b);
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		additionParams(num1, num2);
	}

}
