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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        int val = head.val;
        while(curr != null){
            if(val == curr.val){
                prev.next = curr.next;
            } else{
                val = curr.val;
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}