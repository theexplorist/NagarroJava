package Session25;

import java.util.Scanner;

public class SudokuSolveer {

	private static boolean kyaValidChoiceHai(int[][] mat, int cr, int cc, int choice) {
		// TODO Auto-generated method stub

		for(int col = 0; col < mat.length; col++) {
			if(mat[cr][col] == choice) {
				return false;
			}
		}
		
		for(int row = 0; row < mat.length; row++) {
			if(mat[row][cc] == choice) {
				return false;
			}
		}
		
		int gsr = cr / 3 * 3;
		int gsc = cc / 3 * 3;
		
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if(mat[r + gsr][c + gsc] == choice) {
					return false;
				}
			}
		}
		
		return true;
	}
	private static void solve(int[][] mat, int cr, int cc) {
		// TODO Auto-generated method stub

		if (cr == mat.length) {
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat.length; j++) {
					System.out.print(mat[i][j] + " ");
				}
				System.out.println();
			}
			return;
		}

		int nr = 0, nc = 0;
		if (cc == mat.length - 1) {
			nr = cr + 1;
			nc = 0;
		} else {
			nr = cr;
			nc = cc + 1;
		}

		if (mat[cr][cc] != 0) {
			solve(mat, nr, nc);
		} else {
			for (int choice = 1; choice <= 9; choice++) {
				if (kyaValidChoiceHai(mat, cr, cc, choice)) {
					mat[cr][cc] = choice;
					solve(mat, nr, nc);
					mat[cr][cc] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int[][] board = new int[n][n];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = scn.nextInt();
			}
			// System.out.println();
		}

		//kyaValidChoiceHai(board, 5, 5, 6);
		 solve(board, 0, 0);
	}

}
