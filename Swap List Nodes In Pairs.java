/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode curr = dummy;
        ListNode next = A;
        while (next != null && next.next != null) {
            ListNode node = next.next;
            next.next = node.next;
            node.next = next;
            curr.next = node;
            curr = next;
            next = curr.next;
            
        }
        return dummy.next;
    }
}
