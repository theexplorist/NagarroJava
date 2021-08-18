package Session19;

public class FirstIndex {

	private static int firstOcc(int[] arr, int ci, int n, int search) {
		// TODO Auto-generated method stub

		//base case
		
		if(ci == n) {
			return -1;
		}
		//mera kaam
		if(arr[ci] == search) {
			return ci;
		}
		
		int recAns = firstOcc(arr, ci + 1, n, search);
		
		return recAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 4, 5, 6, 5, 7};
		int search = 10;
		
		System.out.println(firstOcc(arr, 0, arr.length, search));
	}

}
