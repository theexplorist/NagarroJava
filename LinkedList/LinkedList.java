package LinkedList;

public class LinkedList {

	class Node {
		int val;
		Node next;// agle padosi ka address
	}

	Node head; // pehli node/ghar ka address store

	public void display() {
		// TODO Auto-generated method stub

		Node i = head;// int i = 0;
		while (i != null) { // i < arr.length
			System.out.print(i.val + "->");// arr[i]
			i = i.next;// i = i + 1
		}
		System.out.print("null");
		System.out.println();
	}

	public int size() { // o(number of nodes)
		// TODO Auto-generated method stub

		Node i = head;// int i = 0;
		int ct = 0;
		while (i != null) { // i < arr.length
			// System.out.println(i.val);//arr[i]
			ct++;
			i = i.next;// i = i + 1
		}

		return ct;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub

		return this.head == null;
	}

	public int getFirst() throws Exception {
		// TODO Auto-generated method stub
		if (this.isEmpty()) {
			throw new Exception("List khaali hai!");
		}
		return this.head.val;// null.val
	}

	public int getLast() throws Exception {
		// TODO Auto-generated method stub

		if (this.isEmpty()) {
			throw new Exception("List khaali hai!");
		}
		Node i = head;// i = null
		while (i.next != null) {// null.next = npe
			i = i.next;
		}

		return i.val;
	}

	public int getAt(int nodeNumber) throws Exception {
		// TODO Auto-generated method stub

		if (this.isEmpty()) {
			throw new Exception("List khaali hai!");
		}

		if (nodeNumber < 0 || nodeNumber >= this.size()) {
			throw new Exception("Galat index!");
		}
		Node i = head;
		for (int j = 1; j <= nodeNumber; j++) {
			i = i.next;
		}

		return i.val;
	}

	public Node getAtNode(int nodeNumber) throws Exception {
		// TODO Auto-generated method stub

		if (this.isEmpty()) {
			throw new Exception("List khaali hai!");
		}

		if (nodeNumber < 0 || nodeNumber >= this.size()) {
			throw new Exception("Galat index!");
		}
		Node i = head;
		for (int j = 1; j <= nodeNumber; j++) {
			i = i.next;
		}

		return i;
	}

	public void addAtLast(int val) throws Exception {
		// TODO Auto-generated method stub
		Node nn = new Node();
		nn.val = val;
		if (this.isEmpty()) {
			head = nn;
		} else {
			Node last = this.getAtNode(this.size() - 1);// last node ka address
			last.next = nn;
		}
	}

	public void addAtFirst(int val) {
		// TODO Auto-generated method stub

		Node nn = new Node();
		nn.val = val;

		nn.next = head;
		head = nn;
	}

	public void addAt(int idx, int val) throws Exception {

		if (idx < 0 || idx > size()) {
			throw new Exception("Galat index!");
		}

		if (idx == 0) {
			this.addAtFirst(val);
		} else if (idx == this.size()) {
			this.addAtLast(val);
		} else {

			Node nn = new Node();
			nn.val = val;

			Node idx_1 = this.getAtNode(idx - 1);
			Node idxN = this.getAtNode(idx);

			idx_1.next = nn;
			nn.next = idxN;
		}
	}

	public int deleteAtFirst() throws Exception {
		// TODO Auto-generated method stub

		if (this.isEmpty()) {
			throw new Exception("List khaali hai!");
		}

		Node i = head;// null
		int temp = i.val;// null.val -> npe
		head = head.next;
		i.next = null;
		i = null;
		return temp;
	}

	public int deleteAtLast() throws Exception {
		// TODO Auto-generated method stub

		int temp = -1;
		if (this.size() == 1) {
			temp = head.val;
			head = null;
		} else {
			Node last_1 = this.getAtNode(this.size() - 2);// 1 - 2 = -1
//		Node last = last_1.next;
//		temp = last.val
			temp = last_1.next.val;
			last_1.next = null;

		}
		return temp;
	}

	public void deleteAtIndex(int idx) throws Exception {
		// TODO Auto-generated method stub

		if (idx < 0 || idx >= this.size()) {
			throw new Exception("Galat index!");
		}

		if (idx == 0) {
			this.deleteAtFirst();
		} else {
			// idx - 1, idx, idx + 1
			Node idx_1 = this.getAtNode(idx - 1);// 0 - 1 = -1
			Node idxN = idx_1.next;
			Node idxPlus1 = idxN.next;

			idx_1.next = idxPlus1;
			idxN.next = null;
			idxN = null;
		}
	}
}
