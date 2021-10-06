package Queue;

public class Queue {

	protected int[] data;
	protected int front;
	protected int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		System.out.println("Parent");
		this.data = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public Queue(int size) {
		// TODO Auto-generated constructor stub
		this.data = new int[size];
		this.front = 0;
		this.size = 0;
	}

	public void enqueue(int val) throws Exception {
		// TODO Auto-generated method stub

		if (this.size == this.data.length) {
			throw new Exception("Queue full hai be!");
		}

		int idx = front + size;
		idx = idx % this.data.length;
		data[idx] = val;
		size++;
	}

	public int dequeue() throws Exception {
		// TODO Auto-generated method stub

		if (this.isEmpty()) {
			throw new Exception("Khaali hai be!");
		}
		int temp = this.data[front];
		this.data[front] = 0;
		front = front + 1;
		front = front % this.data.length;
		size--;
		return temp;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub

		return this.size == 0;
	}

	public int size() {
		// TODO Auto-generated method stub

		return this.size;
	}

	public void display() {
		// TODO Auto-generated method stub

		for (int i = 0; i < this.data.length; i++) {
			int idx = i + front;
			idx = idx % this.data.length;

			System.out.print(this.data[idx] + " ");
		}

		System.out.println();

	}
	
	public int getFront() throws Exception {
		// TODO Auto-generated method stub

		if(this.isEmpty()) {
			throw new Exception("Khaali hai be!");
		}
		int temp = this.data[front];
		return temp;
	}
	
	public boolean isFull() {
		// TODO Auto-generated method stub

		return this.size == this.data.length;
	}
}
