package Session19;

public class LastIndexTwo {

	private static int lastOcc(int[] arr, int ci, int n, int search) {
		// TODO Auto-generated method stub

		//base case
		
		if(ci == n) {
			return -1;
		}
		
		int recAns = lastOcc(arr, ci + 1, n, search);
		
		//mera kaam
		if(recAns == -1 && arr[ci] == search) {
			return ci;
		}
		
		return recAns;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 4, 5, 6, 5, 7};
		int search = 10;
		int n = arr.length;
		System.out.println(lastOcc(arr, 0, n, search));
	}

}
