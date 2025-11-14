# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = 0
        head = None
        prev = None
        while(l1 or l2 or carry != 0):
            sum = carry
            if(l1):
                sum = sum + l1.val
                l1 = l1.next
            if(l2):
                sum = sum + l2.val
                l2 = l2.next
            carry = sum // 10
            sum = sum % 10
            curr = ListNode(sum)
            if(not head): 
                head = curr
            else:
                prev.next = curr
            prev = curr
        return head



            
        