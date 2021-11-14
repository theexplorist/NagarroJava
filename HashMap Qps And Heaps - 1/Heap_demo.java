package Lec_46;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap_demo {
	public static void main(String[] args) {
//		rank!!, minimum number!! min heap!!
		PriorityQueue<Integer> min_heap = new PriorityQueue<>();
		min_heap.add(20);
		min_heap.add(30);
		min_heap.add(-2);
		min_heap.add(100);
		min_heap.add(3);
		System.out.println(min_heap);
		System.out.println(min_heap.poll());
		System.out.println(min_heap.poll());
		System.out.println(min_heap.poll());
		System.out.println(min_heap.poll());
		System.out.println(min_heap.poll());
		System.out.println(min_heap.size());
		System.out.println("=======================");
//		Max heap
		PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
		max_heap.add(20);
		max_heap.add(30);
		max_heap.add(-2);
		max_heap.add(100);
		max_heap.add(3);
		System.out.println(max_heap);
		System.out.println(max_heap.poll());
		System.out.println(max_heap.poll());
		System.out.println(max_heap.poll());
		System.out.println(max_heap.poll());
		System.out.println(max_heap.poll());
		
	}
}
