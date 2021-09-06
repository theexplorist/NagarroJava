package QPS3;

public class BinarySearch {

	private static int search(int[]arr, int val) {
		// TODO Auto-generated method stub

		int l = 0, h = arr.length - 1;  
		
		while(l <= h) {
			int mid = (l + h) / 2;
			if(arr[mid] == val) {
				return mid;
			} else if(arr[mid] < val) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,3,4, 10, 40};
		System.out.println(search(arr, 50));
	}

}
