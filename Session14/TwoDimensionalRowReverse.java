package Session14;

public class TwoDimensionalRowReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 10, 12, 14, 16 }, { 20, 22, 24, 26 }, { 30, 32, 34, 36 }, { 40, 42, 44, 46 } };
		
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
		
		for(int row = 0; row < n; row++) {
			for(int col = 0; col < m; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
