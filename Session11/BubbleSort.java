package Session11;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {9, 2, 7, 5, 8};
		int n = arr.length;
		
		for(int cp = 1; cp <= n - 1; cp++) { //1, 2, 3
			
			for(int curr = 0; curr <= n - cp - 1; curr++) {
				if(arr[curr] > arr[curr + 1]) {
					int temp = arr[curr];
					arr[curr] = arr[curr + 1];
					arr[curr + 1] = temp;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
