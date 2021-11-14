package Lec_47_48;

import java.util.PriorityQueue;

public class Heap_G_test {
	public static void main(String[] args) {
		heap_G<Integer> PQ1 = new heap_G<Integer>();
		PriorityQueue<Integer> PQ2 = new PriorityQueue<Integer>();
		PQ1.add(10);
		PQ1.add(20);
		PQ1.add(30);
		PQ1.add(40);
		PQ1.add(50);
		
		while(PQ1.size()>0) {
			System.out.print(PQ1.poll()+" ");
		}
		System.out.println("==========");
		PQ2.add(10);
		PQ2.add(20);
		PQ2.add(30);
		PQ2.add(40);
		PQ2.add(50);
		
		while(PQ2.size()>0) {
			System.out.print(PQ2.poll()+" ");
		}
	}
}
