package StackQps1;

import java.util.Arrays;

public class StockSpanBrute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr  = {1, 2, 4, 3, 5};
		
		int[] span = new int[arr.length];
		Arrays.fill(span, 1); //min span - 1
		
		for(int ci = 1; ci < arr.length; ci++) {
			
			for(int left = ci - 1; left >= 0; left--) {
				if(arr[left] < arr[ci]) {
					span[ci]++;
				} else {//arr[left] >= arr[ci]
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(span));
	}

}
