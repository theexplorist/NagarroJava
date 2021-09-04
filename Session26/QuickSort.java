package Session26;

import java.util.Arrays;

public class QuickSort {

	private static void quickSort(int[] arr, int s, int e) {
		// TODO Auto-generated method stub

		if(s >= e) {
			return;
		}
		int mid = (s + e) / 2;
		int pivot = arr[mid];
		int left = s, right = e;
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		quickSort(arr, s, right);
		quickSort(arr, left, e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
		quickSort(arr, 0, arr.length - 1);
	}

}
