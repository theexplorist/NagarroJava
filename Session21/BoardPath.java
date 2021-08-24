package Session21;

public class BoardPath {

	private static void printPaths(String path, int src, int dest) {
		// TODO Auto-generated method stub

		if(src > dest) {
			return;
		}
		
		if(src == dest) {
			System.out.println(path);
			return;
		}
		
		
		printPaths(path + 1, src + 1, dest); //1
		printPaths(path + 2, src + 2, dest); //2
		printPaths(path + 3, src + 3, dest); //3
		printPaths(path + 4, src + 4, dest); //4
		printPaths(path + 5, src + 5, dest); //5
		printPaths(path + 6, src + 6, dest); //6
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPaths("", 0, 10);
	}

}
