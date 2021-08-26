package Session22;

public class MazePathFourDir {

	private static void printPaths(int cr, int cc, int er, int ec, String path, boolean[][] vis) {
		// TODO Auto-generated method stub

		if (cr > er || cc > ec || cc < 0 || cr < 0 || vis[cr][cc] == true) {
			return;
		}

		if (cr == er && cc == ec) {
			System.out.println(path);
			return;
		}

		vis[cr][cc] = true;
		// UP
		printPaths(cr - 1, cc, er, ec, path + 'U', vis);

		// Down
		printPaths(cr + 1, cc, er, ec, path + 'D', vis);
		// Left
		printPaths(cr, cc - 1, er, ec, path + 'L', vis);

		// Right
		printPaths(cr, cc + 1, er, ec, path + 'R', vis);
		vis[cr][cc] = false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPaths(0, 0, 2, 2, "", new boolean[3][3]);
	}

}
