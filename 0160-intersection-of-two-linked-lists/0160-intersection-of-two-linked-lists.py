# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        
    
        def getLength(head):
            length = 0
            while head:
                length += 1
                head = head.next
            return length
        
        len1 = getLength(headA)
        len2 = getLength(headB)
        temp1 = headA
        temp2 = headB
        while len1 > len2:
            temp1 = temp1.next
            len1 -= 1
        while len2 > len1:
            temp2 = temp2.next
            len2 -= 1 
        while temp1 and temp2:
            if temp1 == temp2:
                return temp1
            else:
                temp1 = temp1.next
                temp2 = temp2.next
        return None
            
        