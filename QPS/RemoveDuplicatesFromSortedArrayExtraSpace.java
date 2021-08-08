package QPS;

public class RemoveDuplicatesFromSortedArrayExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		// Arrays.sort(arr);
		int n = arr.length;

		if (n <= 1) { // curr + 1
			return;
		}

		// int[] out = new int[n];
		int index = 0;
		for (int curr = 0; curr <= n - 2; curr++) {
			if (arr[curr] != arr[curr + 1]) {
				// out waale mein insert

				arr[index] = arr[curr];
				index++;
			}
		}

		// add last element
		arr[index] = arr[n - 1];
		System.out.println(index + 1); // count of elements after removing duplicates
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
