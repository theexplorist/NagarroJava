package Session2;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("Uppercase!");
		} else if(ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase!");
		} else {
			System.out.println("Invalid");
		}
	}

}
