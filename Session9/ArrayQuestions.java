package Session9;

public class ArrayQuestions {

	private static int minInArray(int[] arr) {
		// TODO Auto-generated method stub

		int minValue = Integer.MAX_VALUE;
		int minIndex = -1;
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] < minValue) {
				minIndex = index;
				minValue = arr[index];
			}
		}
		
		System.out.println("Min Index is " + minIndex);
		return minValue;
	}
	private static int searchElement(int[] arr, int search) {
		// TODO Auto-generated method stub

		for(int index = 0; index < arr.length; index++) {
			if(arr[index] == search) {
				return index;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 5, 3, 9};
		//int ans = searchElement(arr, 3);
		int ans = minInArray(arr);
		System.out.println(ans);
	}

}
