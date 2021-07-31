package Session11;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {9, 2, 7, 5, 8};
		int n = arr.length;
		
		for(int curr = 1; curr < n; curr++) {
			int currCard = arr[curr];
			int prevIndex =  curr - 1;
			
			while(prevIndex >= 0 && currCard < arr[prevIndex]) {
				arr[prevIndex + 1] = arr[prevIndex];
				prevIndex--;
			}
			
			arr[prevIndex + 1] = currCard; 
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
