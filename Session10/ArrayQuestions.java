package Session10;

public class ArrayQuestions {

	private static void actualReverse(int[] arr, int start,  int n) {
		// TODO Auto-generated method stub

		int h1 = start, h2 = n - 1;// two hands/pointers

		while (h1 < h2) {// h1 == h2, h1 > h2 -> stop
			int temp = arr[h1];
			arr[h1] = arr[h2];
			arr[h2] = temp;
			h1++;
			h2--;
		}
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
	}
	private static void rotate2(int[] arr, int n, int k) {
		k = k % n;
		
		//n reverse
		actualReverse(arr, 0, n);
		
		//first k 
		actualReverse(arr, 0, k);
		
		//last n - k elements reverse
		actualReverse(arr, k, n);
	}
	private static void rotate1(int[] arr, int n, int k) {
		// picking the element from last room

		k = k % n; // this is optimization step
		for (int i = 0; i < k; i++) {
			int picked = arr[n - 1];

			for (int curr = n - 2; curr >= 0; curr--) {
				arr[curr + 1] = arr[curr];
			}

			arr[0] = picked;
		}

	}

	private static void printReverse(int[] arr, int n) {
		// TODO Auto-generated method stub

//		int curr = n - 1;
//		
//		while(curr >= 0) {
//			System.out.println(arr[curr]);
//			curr--;
//		}

		for (int curr = n - 1; curr >= 0; curr--) {
			System.out.print(arr[curr] + " ");
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;

		rotate2(arr, n, 10);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
