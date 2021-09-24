package Stacks;

public class DynamicStack extends StackUsingArrays {

	
	@Override
	public void push(int item) throws Exception {
		// TODO Auto-generated method stub
		if(this.isFull()) {
			int[] newData = new int[2 * this.data.length];
			for(int index = 0; index <= this.tos; index++) {
				newData[index] = this.data[index];
			}
//			System.out.println(Arrays.toString(newData));
//			System.out.println(this.tos);
			this.data = newData;
		}
		super.push(item);
	}
	
	public static void main(String[] args) throws Exception {
		DynamicStack st = new DynamicStack();
		
		for(int i = 1; i < 7; i++) {
			st.push(i * 10);
		}
		System.out.println(st.peek());
		st.pop();
		st.display();
	}
	
}
