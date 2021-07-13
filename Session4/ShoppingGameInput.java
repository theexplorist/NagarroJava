package Session4;

import java.util.Scanner;

public class ShoppingGameInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		for(int i = 1; i <= t; i++) {
			int aayushN = s.nextInt();
			int harshitN = s.nextInt();
			
			System.out.println(aayushN + " " + harshitN);
		}
	}

}
