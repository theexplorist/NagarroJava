package LinkedListLeetcodeSession1;

import LinkedListLeetcodeSession1.ReverseLinkedList2.ListNode;

public class ReverseLinkedList1 {

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

	public ListNode reverseList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}
		ListNode revList = head;
		ListNode todo = head.next;
		revList.next = null;

		while (todo != null) {
			ListNode temp = todo;
			todo = todo.next;
			temp.next = revList;
			revList = temp;
		}

		return revList;
	}
}
