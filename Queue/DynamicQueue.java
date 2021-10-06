package Queue;

public class DynamicQueue extends Queue {

	public DynamicQueue() {
		// TODO Auto-generated constructor stub
		
		System.out.println("child");
		
	}
	@Override
	public void enqueue(int val) throws Exception {
		// TODO Auto-generated method stub
		if(this.isFull()) {
			int[] newdata = new int[2 * this.data.length];
			
			for (int i = 0; i < this.data.length; i++) {
				int idx = i + front;
				idx = idx % this.data.length;
				newdata[i] = this.data[idx];		
			}
			
			this.data = newdata;
			front = 0;
		}
		
		super.enqueue(val);
	}
	
	public static void main(String[] args) {
		DynamicQueue q = new DynamicQueue();
	}
}
