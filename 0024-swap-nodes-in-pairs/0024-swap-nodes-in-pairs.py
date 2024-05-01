# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head
        current = head
        prev = dummy
        while current and current.next:
            temp = current.next.next
            prev.next = current.next
            current.next.next = current
            current.next = temp
            prev = current
            current = current.next
        return dummy.next