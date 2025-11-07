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
        ListNode temp = head;
        ListNode prev = head;
        ListNode running = head.next;
        while(running != null){
            if(prev.val != running.val){
                prev.next = running;
                prev = running;
            } else {
                prev.next = null;
            }
            running = running.next;
        }
        return temp;
    }
}