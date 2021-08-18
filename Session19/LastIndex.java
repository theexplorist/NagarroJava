package Session19;

public class LastIndex {

	private static int lastOcc(int[] arr, int ci, int n, int search) {
		// TODO Auto-generated method stub

		// base case

		if (ci == -1) {
			return -1;
		}
		// mera kaam
		if (arr[ci] == search) {
			return ci;
		}

		//rec ka kaam
		int recAns = lastOcc(arr, ci - 1, n, search);

		return recAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 4, 5, 6, 5, 7};
		int search = 10;
		int n = arr.length;
		System.out.println(lastOcc(arr, n - 1, n, search));
	}

}
