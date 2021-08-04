package Session12;

public class ProductOfArrayExceptSelf {

	//version of rain watter trapping
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4};
		int n = arr.length;
		
		int[] leftProduct = new int[n];
		int[] rightProduct = new int[n];
		
		leftProduct[0] = 1;
		rightProduct[n - 1] = 1;
		
		for(int curr = 1; curr < n; curr++) {
			leftProduct[curr] = leftProduct[curr - 1] * arr[curr - 1];
		}
		
		for(int curr = n - 2; curr >= 0; curr--) {
			rightProduct[curr] = rightProduct[curr + 1] * arr[curr + 1];
		}
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print(leftProduct[i] + " ");
//		}
//		
//		System.out.println();
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print(rightProduct[i] + " ");
//		}
		
		int[] ans = new int[n];
		for(int i = 0; i < n; i++) {
			ans[i] = leftProduct[i] * rightProduct[i];
		}
		
		
	}

}
