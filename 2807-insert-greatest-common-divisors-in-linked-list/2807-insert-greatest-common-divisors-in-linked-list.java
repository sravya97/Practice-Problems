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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;
        while(current != null && current.next != null){
            int gcd = getGcd(current.val, current.next.val);
            ListNode newNode = new ListNode(gcd);
            ListNode temp = current.next;
            current.next = newNode;
            newNode.next = temp;
            current = temp;
        }
        return head;
    }
    
    public int getGcd(int num1, int num2){
        int smaller = Math.min(num1, num2);
        int larger = Math.max(num1, num2);
        int gcd = smaller;
        while(larger % smaller != 0){
            gcd = larger % smaller;
            larger = smaller;
            smaller = gcd;
        }
        return gcd;
    }
}