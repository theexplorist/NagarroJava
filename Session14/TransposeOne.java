package Session14;

public class TransposeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] inp = { { 10, 12, 14, 16 }, { 20, 22, 24, 26 }, { 30, 32, 34, 36 }, { 40, 42, 44, 46 }, {50, 52, 54, 56} };

		int n = inp.length;
		int m = inp[0].length;
		
		int[][] out = new int[m][n];
		
		for(int row = 0; row < n; row++) {
			for(int col = 0; col < m; col++) {
				int curr = inp[row][col];
				out[col][row] = curr;
			}
		}
		
		for(int row = 0; row < m; row++) {
			for(int col = 0; col < n; col++) {
				System.out.print(out[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
