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
    public void reorderList(ListNode head) {
        int length=0;
        ListNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middle = slow.next;
        slow.next = null;
        middle = reverse(middle);
        ListNode temp = head;
        while(temp != null && middle != null){
            ListNode t1 = temp.next;
            ListNode t2 = middle.next;

            temp.next = middle;
            middle.next = t1;

            temp = t1;
            middle = t2;
        }
    }

    public ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}