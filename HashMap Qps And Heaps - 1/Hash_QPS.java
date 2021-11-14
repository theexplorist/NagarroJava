package Lec_46;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash_QPS {
	public static void main(String[] args) {
//		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
//		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
//		inter2_arry(arr1, arr2);
		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6, 7 };
		all_cons_seq(arr);
	}

	private static void all_cons_seq(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i]-1)) {
				map.put(arr[i],false);
			}
			else {
				map.put(arr[i],true);
			}
//			Update!! afar arr[i]+1, then make it false
			if(map.containsKey(arr[i]+1)) {
				map.put(arr[i]+1, false);
			}
		}
		System.out.println(map);
		for(int key : map.keySet()) {
			if(map.get(key)) {
//				If starting element
				
				int start = key;
				while(map.containsKey(start)) {
					System.out.print(start+" ");
					start++;
				}
				System.out.println();
			}
		}
	}

	private static void inter2_arry(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> AL = new ArrayList<>();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

//		rat jao bhai 
		for (int i = 0; i < arr1.length; i++) {
//			way 1
//			if(map.containsKey(arr1[i])) {
//				int prev_freq=map.get(arr1[i]);
//				map.put(arr1[i],prev_freq+1);
//			}
//			else {
//				map.put(arr1[i],1);
//			}
//			way2
			int prev_freq = map.getOrDefault(arr1[i], 0);
			map.put(arr1[i], prev_freq + 1);
		}
		System.out.println(map);

		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				AL.add(arr2[i]);
				// Delete bhi to karrna hein ?
				int curr_freq = map.get(arr2[i]);
				map.put(arr2[i], curr_freq - 1);
			}
		}
		System.out.println(AL);
	}

}
