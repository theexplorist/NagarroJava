package Session2;

import java.util.Scanner;

public class IfElseDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		boolean xbox = s.nextBoolean();
		boolean ps5 = s.nextBoolean();
		
		if(xbox == true || ps5 == true) {
			System.out.println("I can play games!");
		} else {
			System.out.println("Alas I am poor!");
		}
	}

}
