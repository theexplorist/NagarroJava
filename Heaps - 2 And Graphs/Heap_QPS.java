package Lec_47_48;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Heap_QPS {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> AL = new ArrayList<ArrayList<Integer>>();

		AL.add(new ArrayList<Integer>());
		AL.get(0).add(10);
		AL.get(0).add(20);
		AL.get(0).add(30);

		AL.add(new ArrayList<Integer>());
		AL.get(1).add(15);
		AL.get(1).add(35);

		AL.add(new ArrayList<Integer>());
		AL.get(2).add(5);
		AL.get(2).add(7);
		AL.get(2).add(12);
		AL.get(2).add(25);

		AL.add(new ArrayList<Integer>());
		AL.get(3).add(17);
		AL.get(3).add(22);
		AL.get(3).add(40);

//		System.out.println(AL);
//		merge_K(AL);
		///////////////////////////////////
		int[]arr={20,30,60,50,10,55,57,40};
		k_largest(arr, 3);
	}

	static class pair implements Comparable<pair> {
		int val;
		int arr;
		int idx;
		Integer i;

		public pair(int val1, int arr1, int idx1) {
			// TODO Auto-generated constructor stub
			val = val1;
			arr = arr1;
			idx = idx1;
		}

		@Override
		public int compareTo(pair o) {
//			this -o ?
			// TODO Auto-generated method stub
			return this.val - o.val;
		}

		public String toString() {
			return "{" + val + "_arr_" + arr + "_idx_" + idx + "}";
		}
	}

	public static void merge_K(ArrayList<ArrayList<Integer>> AL) {
		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<pair> PQ = new PriorityQueue<pair>();
//		PQ.add(new pair(0,0,0));
		for (int i = 0; i < AL.size(); i++) {
			PQ.add(new pair(AL.get(i).get(0), i, 0));
		}
//		System.out.println(PQ);
		while (!PQ.isEmpty()) {
//			System.out.println(PQ.poll().val);
			pair temp = PQ.poll();
			ans.add(temp.val);

			if (temp.idx + 1 < AL.get(temp.arr).size()) {
				temp.val = AL.get(temp.arr).get(temp.idx + 1);
				temp.idx = temp.idx + 1;
				PQ.add(temp);
			}
		}
		System.out.println(ans);
	}
	public static void k_largest(int[] arr,int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		
		for(int i=0;i<arr.length;i++) {
			PQ.add(arr[i]);
			if(PQ.size()>k) {
				PQ.poll();
			}
		}
		System.out.println(PQ);
	}
}
