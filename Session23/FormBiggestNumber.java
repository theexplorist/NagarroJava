package Session23;

import java.util.Scanner;

public class FormBiggestNumber {

	// +ve -> swapping hogi, -ve -> swapping nahin hogi
	private static int compare(int curr, int curr_1) { // curr = X, curr + 1 = Y
		// TODO Auto-generated method stub

		String xy = curr + "" + curr_1;
		String yx = curr_1 + "" + curr;

		int xyI = Integer.valueOf(xy);
		int yxI = Integer.valueOf(yx);

		if (xyI > yxI) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			for (int cp = 1; cp <= n - 1; cp++) { // 1, 2, 3

				for (int curr = 0; curr <= n - cp - 1; curr++) {
					if (compare(arr[curr], arr[curr + 1]) > 0) {
						int temp = arr[curr];
						arr[curr] = arr[curr + 1];
						arr[curr + 1] = temp;
					}
				}
			}

			for (int i = 0; i < n; i++) {
				System.out.print(arr[i]);
			}
			tc--;
		}

	}

}
