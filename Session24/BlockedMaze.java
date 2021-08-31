package Session24;

public class BlockedMaze {

	private static void printPaths(int[][] maze, int cr, int cc, int er, int ec, String path, boolean[][] vis) {
		// TODO Auto-generated method stub

		if (cr > er || cc > ec || cc < 0 || cr < 0 || vis[cr][cc] == true || maze[cr][cc] == 1) {
			return;
		}

		if (cr == er && cc == ec) {
			System.out.println(path);
			return;
		}

		vis[cr][cc] = true;
		// UP
		printPaths(maze, cr - 1, cc, er, ec, path + 'U', vis);

		// Down
		printPaths(maze, cr + 1, cc, er, ec, path + 'D', vis);
		// Left
		printPaths(maze, cr, cc - 1, er, ec, path + 'L', vis);

		// Right
		printPaths(maze, cr, cc + 1, er, ec, path + 'R', vis);
		vis[cr][cc] = false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1-> blockd, 0 -> no blockage
		
		int[][] maze = {{0, 1, 0, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}, {0, 1, 1, 0}};
		printPaths(maze, 0, 0, maze.length - 1, maze[0].length - 1, "", new boolean[maze.length][maze[0].length]);
	}

}
