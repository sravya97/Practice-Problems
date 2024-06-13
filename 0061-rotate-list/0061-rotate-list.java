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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        
        int length = 0;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        k = k % length;
        if(k==0){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        temp = slow.next;
        slow.next = null;
        fast.next = head;
        return temp;
    }
}