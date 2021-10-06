package Queue;

public class ClientQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		q.enqueue(60);
		q.enqueue(70);
		q.display();
		
		q.enqueue(80);
	}

}
