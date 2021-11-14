package Lec_46;

public class Client_heap {
	public static void main(String[] args) {
		heap pq = new heap();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		pq.add(60);
		pq.disp();
//		
		pq.add(9);
		pq.disp();
//		
		System.out.println("==================");
		System.out.println(pq.poll());
		pq.disp();		

		System.out.println("==================");
		System.out.println(pq.poll());
		pq.disp();		

		System.out.println("==================");
		System.out.println(pq.poll());
		pq.disp();		

		System.out.println("==================");
		System.out.println(pq.poll());
		pq.disp();		

		System.out.println("==================");
		System.out.println(pq.poll());
		pq.disp();		

		System.out.println("==================");
		System.out.println(pq.poll());
		pq.disp();		

		System.out.println("==================");
		System.out.println(pq.poll());
		pq.disp();		
	}
}
