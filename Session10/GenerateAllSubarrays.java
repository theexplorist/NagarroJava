package Session10;

public class GenerateAllSubarrays {

	public int recursive(int n) {
		
		if(n == 1) {
			return 1;
		}
		
		return recursive(n - 1) + recursive(n - 1);
	}
	private static void generateSubs(int[] arr, int n) {
		// TODO Auto-generated method stub

		int maxSum = Integer.MIN_VALUE; //
		for (int si = 0; si < n; si++) {
			for (int ei = si; ei < n; ei++) {

				int sum = 0;
				for (int k = si; k <= ei; k++) {//[0, 2] -> {1, 2, 3}
					sum += arr[k];
					System.out.print(arr[k] + " ");
				}
				
				if(sum > maxSum) {
					maxSum = sum;
				}

				System.out.print("sum is " + sum);
				System.out.println();
			}
		}
		
		System.out.println("MAX SUM IS : " + maxSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, -2, 0, 2, 3, 4 };
		int n = arr.length;
		int k = 2;
		generateSubs(arr, n);

	}

}
