package LinkedList;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		
//		System.out.println(ll.isEmpty());
		ll.addAtLast(10);
		ll.display();
//		ll.addAtLast(20);
//		ll.addAtLast(30);
//		ll.addAtLast(40);
//		ll.display();
//		ll.addAtFirst(50);
//		ll.display();
//		ll.addAt(ll.size(), 60);
//		ll.display();
//		int val = ll.deleteAtFirst();
//		System.out.println(val);
//		ll.display();
//		System.out.println(ll.deleteAtLast());
		//ll.display();
		ll.deleteAtIndex(1);
		ll.display();
	}

}
