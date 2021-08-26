package Session22;

public class MazePathTwoDir {

	//static int count;

	private static int printPath(int cr, int cc, int er, int ec, String path) {
		// TODO Auto-generated method stub

		if (cr > er || cc > ec) {
			return 0;
		}

		if (cr == er && cc == ec) {
			System.out.println(path);
			return 1;
		}
		// Horizontal Right
		int countH = printPath(cr, cc + 1, er, ec, path + 'H');
		// Vertical Down
		int countV = printPath(cr + 1, cc, er, ec, path + 'V');

		return countH + countV;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 3, n = 3;
		for (int i = 0; i < 2; i++) {
			//count = 0;
		    int ct = printPath(0, 0, m - 1, n - 1, "");
			System.out.println(ct);
		}
		
	}

}
