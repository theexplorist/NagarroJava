package Stacks;

//Fixed Size Stack
public class StackUsingArrays {

	// object/instance scope
	int[] data;
	int tos;

	public StackUsingArrays() {
		// TODO Auto-generated constructor stub
		this.data = new int[5];
		this.tos = -1;
	}

	public StackUsingArrays(int capacity) {
		// TODO Auto-generated constructor stub
		this.data = new int[capacity];
		this.tos = -1;
	}

	public void push(int item) throws Exception {
		// TODO Auto-generated method stub
		if (isFull()) {
			throw new Exception("Tera stack full hai be!");
		}
		tos++;
		data[tos] = item;
	}

	public int peek() throws Exception {
		// TODO Auto-generated method stub

		if(this.isEmpty()) {
			throw new Exception("Tera stack khaali hai, gareeb!");
		}
		return data[tos];
	}
	
	public int size() {
		// TODO Auto-generated method stub

		return this.tos + 1;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.size() == 0;
	}
	public boolean isFull() {
		// TODO Auto-generated method stub
		return this.size() == this.data.length;
	}

	public int pop() throws Exception {
		// TODO Auto-generated method stub
		if(this.isEmpty()) {
			throw new Exception("Tera stack khaali hai, gareeb!");
		}
		int temp = this.data[tos];
		this.data[tos] = 0;
		this.tos--;
		
		return temp;
	}
	
	public void display() {
		// TODO Auto-generated method stub

		System.out.println("****************");
		for(int index = this.tos; index >= 0; index--) {
			System.out.print(this.data[index] + " ");
		} 
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		StackUsingArrays st = new StackUsingArrays();// 5 size ka stack
		System.out.println(st.isEmpty());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.isEmpty());
		//st.push(60);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		st.display();
	}
}
