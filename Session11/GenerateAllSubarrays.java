package Session11;

public class GenerateAllSubarrays {

	
	private static void generateSubs(int[] arr, int n) {
		// TODO Auto-generated method stub

		int maxSum = Integer.MIN_VALUE; //
		int maxSumStart = 0, maxSumEnd = 0;
		for (int si = 0; si < n; si++) {
			int sum = 0;
			
			for (int ei = si; ei < n; ei++) {

				sum = sum + arr[ei];
				if(sum > maxSum) {
					maxSumStart = si;
					maxSumEnd = ei;
					maxSum = sum;
				}
				System.out.println(si + " " + ei + " " + sum);
			}
		}
		
		System.out.println("MAX SUM IS : " + maxSum + " Starting from " + maxSumStart + " ending at " + maxSumEnd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4 };
		int n = arr.length;
		int k = 2;
		generateSubs(arr, n);

	}

}
