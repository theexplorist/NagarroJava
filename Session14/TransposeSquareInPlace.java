package Session14;

public class TransposeSquareInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 10, 12, 14 }, { 20, 22, 24 }, { 30, 32, 34 } };

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {

				// row < col

				if (row < col) {
					int temp = arr[row][col];
					arr[row][col] = arr[col][row];
					arr[col][row] = temp;
				}
			}
		}

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
