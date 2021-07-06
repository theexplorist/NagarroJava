package Session1;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int s;
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt(); //principal = 1000
		int roi = sc.nextInt();
		int time = sc.nextInt();
		
		boolean a = sc.nextBoolean();
		System.out.println(a);
		int si = (principal * roi * time) / 100;
		System.out.println(si);
	}

}
