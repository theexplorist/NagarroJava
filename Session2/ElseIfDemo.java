package Session2;

import java.util.Scanner;

public class ElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int h1 = s.nextInt();
		int h2 = s.nextInt();
		
		if(h1 > h2) {
			System.out.println("Opp1 will win!");
		} else if(h1 == h2) {
			System.out.println("Draw!");
		} else {
			System.out.println("Opp2 will win!");
		}
	}

}
