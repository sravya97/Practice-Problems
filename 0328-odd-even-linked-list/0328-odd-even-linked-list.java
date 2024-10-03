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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode oddHead = head;
         ListNode temp = head.next;
        ListNode evenHead = temp;
        while(evenHead != null && evenHead.next!=null){
            ListNode evenNext = evenHead.next.next;
            oddHead.next = evenHead.next;
            evenHead.next = evenNext;
            oddHead = oddHead.next;
            evenHead = evenHead.next;
        }
        oddHead.next = temp;
        return head;
    }
}