# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getGcd(self, num1, num2):
        smaller = num1 if num1 < num2 else num2
        larger = num1 if num1 > num2 else num2
        gcd = smaller
        while larger % smaller != 0 : 
            gcd = larger % smaller
            larger = smaller
            smaller = gcd
        return gcd
    
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current = head
        while current and current.next:
            newNode = ListNode(self.getGcd(current.val, current.next.val))
            temp = current.next
            current.next = newNode
            newNode.next = temp
            current = temp
        return head
    
    
            
        