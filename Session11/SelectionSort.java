package Session11;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {9, 2, 5, 8, 7};
		int n = arr.length;
		
		for(int marker = 0; marker < n - 1; marker++) {
			int minVal = Integer.MAX_VALUE;
			int minInd = -1;
			
			for(int curr = marker; curr < n; curr++) {
				if(arr[curr] < minVal) {
					minVal = arr[curr];
					minInd = curr;
				}
			}
			
			int temp = arr[marker];
			arr[marker] = arr[minInd];
			arr[minInd] = temp;
			System.out.println(minVal);
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
