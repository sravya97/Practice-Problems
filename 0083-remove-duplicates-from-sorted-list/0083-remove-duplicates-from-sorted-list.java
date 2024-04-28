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
        int curr = head.val;
        ListNode temp = head.next;
        ListNode prev = head;
        while(temp != null){
            if(temp.val != curr){
                prev.next = temp;
                prev = temp;
                curr = temp.val;
            }
            temp = temp.next;
        }
        prev.next = null;
        return head;
    }
}