/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(len1 > len2){
            len1--;
            temp1 = temp1.next;
        }
        while(len2 > len1){
            len2--;
            temp2 = temp2.next;
        }
        while(temp1 != null && temp2 != null){
            if(temp1 == temp2){
                return temp1;
            } else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return null;
    }
    
    public int getLength(ListNode head){
        int length = 0;
        while(head != null){
            head = head.next;
            length++;
        }
        return length;
    }
}