package Session26;

public class Mergesort {

	private static int[] merge(int[] left, int[] right) {
		// TODO Auto-generated method stub

		int[] merged = new int[left.length + right.length];
		
		int i = 0, j = 0, k = 0;
		while(i < left.length && j < right.length) {
			if(left[i] < right[j]) {
				merged[k] = left[i];
				i++;
				k++;
			} else {
				merged[k] = right[j];
				j++;
				k++;
			}
		}
		while(i < left.length) {
			merged[k] = left[i];
			k++;
			i++;
		}
		
		while(j < right.length) {
			merged[k] = right[j];
			k++;
			j++;
		}
		return merged;
	}
	//start -> 0,  eend -> arr.leength - 1
	private static int[] mergeSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub

		if(start == end) {
			int[] bca = new int[1];
			bca[0] = arr[start];
			return bca;
		}
		int mid = (start + end) / 2;
		int[] left = mergeSort(arr, start, mid);
		int[] right = mergeSort(arr, mid + 1, end);
		int[] combined = merge(left, right);
		return combined;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {50, 40, 80, 90, 70, 10, 30, 60, 120};
		for(int e : mergeSort(arr, 0, arr.length - 1)) {
			System.out.print(e + " ");
		}
	}

}
