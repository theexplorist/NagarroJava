package Session14;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		
		//reverse
		int n = arr.length;
		int m = arr[0].length;
		
		for(int row = 0; row < n; row++) {
			//reverse every row
			int l = 0, r = m - 1;
			
			while(l < r) {
				int temp = arr[row][l];
				arr[row][l] = arr[row][r];
				arr[row][r] = temp;
				l++;
				r--;
			}
			
		}
		
//		for(int row = 0; row < n; row++) {
//			for(int col = 0; col < m; col++) {
//				System.out.print(arr[row][col] + " ");
//			}
//			System.out.println();
//		}
		
		
		//transpose
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
