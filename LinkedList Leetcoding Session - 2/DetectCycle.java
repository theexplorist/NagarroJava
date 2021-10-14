/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode t = head;
        ListNode r = head;
        
        while(r != null && r.next != null) {
            t = t.next;
            r = r.next.next;//r.next = null -> null.next -> npe
            if(t == r) {
                return true;
            }
        }
        
        return false;
    }
}
