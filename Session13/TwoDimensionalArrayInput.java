package Session13;

import java.util.Scanner;

public class TwoDimensionalArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int n = s.nextInt(); // rows
		int m = s.nextInt(); // cols

		int[][] arr = new int[n][m];

		int[] ar = new int[n];

//		for (int i = 0; i < n; i++) {
//			ar[i] = s.nextInt();
//		}

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < m; col++) {
				arr[row][col] = s.nextInt();
			}
		}
		
		System.out.println("After taking input");
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
