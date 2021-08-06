package Session13;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 11, 12, 13, 14 },
				        { 21, 22, 23, 24 }, 
				        { 31, 32, 33, 34 }, 
				        { 41, 42, 43, 44 } };
		
		int n = arr.length; //rows
		int m = arr[0].length;//cols
		
		int sr = 0;
		int sc = 0;
		int er = n - 1;
		int ec = m - 1;
		int totalElements = n * m;
		int count = 0;
		while(count < totalElements) {
			//row is fixed with value sr
			for(int col = sc; col <= ec; col++) {
				System.out.print(arr[sr][col] + " ");
				count++;
			}
			sr++;
			
			//col is fixed with value ec
			for(int row = sr; row <= er; row++) {
				System.out.print(arr[row][ec] + " ");
				count++;
			}
			
			ec--;
			//row is fixed with value er
			for(int col = ec; col >= sc; col--) {
				System.out.print(arr[er][col] + " ");
				count++;
			}
			er--;
			
			//col fixed -> sc
			for(int row = er; row >= sr; row--) {
				System.out.print(arr[row][sc] + " ");
				count++;
			}
			
			sc++;
		}
		
	}

}
