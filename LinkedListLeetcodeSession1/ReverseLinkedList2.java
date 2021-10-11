package LinkedListLeetcodeSession1;

public class ReverseLinkedList2 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode reverseList(ListNode head, ListNode rightPlus1, ListNode leftM1, ListNode actualHead) {

		if (head == null || head.next == null) {
			return head;
		}
		ListNode revList = head;
		ListNode todo = head.next;
		revList.next = rightPlus1;

		while (todo != rightPlus1) {
			ListNode temp = todo;
			todo = todo.next;
			temp.next = revList;
			revList = temp;
		}

		if (leftM1 != null) {
			leftM1.next = revList;
			return actualHead;
		} else {
			return revList;
		}

		// return actualHead;
	}

	public ListNode getAtNode(int nodeNumber, ListNode head) {
		// TODO Auto-generated method stub

		if (head == null) {
			return head;
		}

		if (nodeNumber < 1) {
			return null;
		}
		ListNode i = head;
		for (int j = 1; j < nodeNumber; j++) {
			i = i.next;
		}

		return i;
	}

	public ListNode reverseBetween(ListNode head, int left, int right) {
		if (left == right) {
			return head;
		}
		ListNode leftN = getAtNode(left, head);
		ListNode rightPlus1 = getAtNode(right + 1, head);
		ListNode leftM1 = getAtNode(left - 1, head);
		// System.out.println(leftN.val);
		// System.out.println(rightPlus1.val);
		return reverseList(leftN, rightPlus1, leftM1, head);
	}
}
