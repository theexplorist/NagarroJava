package Session13;

public class WavePrintRowise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		int n = arr.length;
		int m = arr[0].length;

		for (int row = 0; row < n; row++) {

			// even row, run loop from left to right
			if (row % 2 == 0) {
				for (int col = 0; col < m; col++) {
					System.out.print(arr[row][col] + " ");

				}
			} else { //odd row, run loop from right to left
				for (int col = m - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + " ");
				}
			}

			System.out.println();
		}

	}

}
