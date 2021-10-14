/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode t = head;
        ListNode r = head;
        
        for(int  i = 1; i <= n; i++) {
            r = r.next;
        }
        
        if(r == null) {
            return head.next;
        }
        while(r != null && r.next != null) {
            r = r.next;
            t = t.next;
        }
        
        System.out.println(t.val);
        t.next = t.next.next;
        return head;
    }
}
