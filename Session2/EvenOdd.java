package Session2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		int rem = num % 2;
		if(rem == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}

}
