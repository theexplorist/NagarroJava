package Lec_46;

import java.util.ArrayList;

public class heap {
	private ArrayList<Integer> AL;

	public heap() {
		// TODO Auto-generated constructor stub
		AL = new ArrayList<>();
	}

	public int size() {
		return AL.size();
	}

	public void disp() {
		System.out.println(AL);
	}

	public void add(int ele) {
		AL.add(ele);
//		process
		heapify(AL.size() - 1);
	}

	private void heapify(int child) {
		int parent = (child - 1) / 2;
		if (AL.get(child) < AL.get(parent)) {
//			swap!!
			swap(child, parent);
//			
			heapify(parent);
		}
	}

	private void swap(int child, int parent) {
		int temp = AL.get(parent);
		AL.set(parent, AL.get(child));
		AL.set(child, temp);
	}

	public int peek() {
		return AL.get(0);
	}

	public int poll() {
		int temp = AL.get(0);
//		swap !! index 0 to last element
		swap(0, AL.size() - 1);
//		delete last element with ease!!1
		AL.remove(AL.size() - 1);

//		down heapify
		D_heapify(0);
		return temp;
	}

	private void D_heapify(int child) {
		int left_c = child * 2 + 1;
		int right_c = child * 2 + 2;

		int min_idex = child;
		if (left_c < AL.size() && AL.get(min_idex) > AL.get(left_c)) {
			min_idex = left_c;
		}
		if (right_c < AL.size() && AL.get(min_idex) > AL.get(right_c)) {
			min_idex = right_c;
		}

		if (child != min_idex) {
			swap(child, min_idex);
			D_heapify(min_idex);
		}

	}
}
