package Session3;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int nst = s.nextInt(); // 5

		int nr = 5;

		int countR = 1;
		while (countR <= nr) {
			int count = 0;
			while (count < nst) {
				System.out.print("*");
				count++;
			}
			System.out.println();
			countR++;
		}

		/*
		 * count = 0; while(count < nst) { System.out.print("*"); count++; }
		 * System.out.println(); count = 0; while(count < nst) { System.out.print("*");
		 * count++; }
		 */
	}

}
