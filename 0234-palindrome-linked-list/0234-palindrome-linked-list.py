# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        
        def reverse(middle):
            prev = None
            curr = middle
            while curr:
                temp = curr.next
                curr.next = prev
                prev = curr
                curr = temp
            return prev
        
        slow = head
        fast = head.next
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
        
        middleReversed = reverse(slow.next)
        slow.next = None
        
        while middleReversed:
            if middleReversed.val != head.val:
                return False
            else:
                middleReversed = middleReversed.next
                head = head.next
        return True
                
        