package Session24;

public class NQueen {

	static int count;

	private static boolean kyaQueenRakhSakteHain(int[][] board, int cr, int cc, int n) {
		// TODO Auto-generated method stub

		for(int row = 0; row <= cr - 1; row++) {
			if(board[row][cc] == 1) {
				return false;
			}
		}
		
		int row = cr;
		int col = cc;
		
		while(row >= 0 && col >= 0) {
			if(board[row][col] == 1) {
				return false;
			}
			
			row--;
			col--;
		}
		
		row = cr;
		col = cc;
		
		while(row >= 0 && col < n) {
			if(board[row][col] == 1) {
				return false;
			}
			row--;
			col++;
		}
		
		return true;
	}

	private static void countNQueen(int[][] board, int cr, int n) {
		// TODO Auto-generated method stub

		if (cr == n) {
			
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) {
					if(board[r][c] == 1) {
						System.out.print("Q ");
					} else {
						System.out.print("_ ");
					}
				}
				System.out.println();
			}
			
			System.out.println("--------------------------------");
			
			count++;
			return;
		}
		for (int cc = 0; cc < n; cc++) {
			if (kyaQueenRakhSakteHain(board, cr, cc, n)) {
				board[cr][cc] = 1; // queeen placed
				countNQueen(board, cr + 1, n);
				board[cr][cc] = 0;
			}
		}

		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] board = new int[4][4];// all 0 means no queen placeed
		count = 0;
		countNQueen(board, 0, 4);
		System.out.println(count);
	}

}
