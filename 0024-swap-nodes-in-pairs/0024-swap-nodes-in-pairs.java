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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy.next;
        ListNode prev = dummy;
        while(current != null && current.next != null){
            ListNode temp = current.next.next;
            prev.next = current.next;
            current.next.next = current;
            current.next = temp;
            prev = current;
            current = current.next;
            
        }
        return dummy.next;
    }
}