# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def getHeight(root, height):
            if not root:
                return height
            elif height < 0:
                return height
            else:
                left = getHeight(root.left, height + 1)
                right = getHeight(root.right, height + 1)
                if left < 0 or right < 0 or abs(left-right) > 1:
                    return -1
                else:
                    return max(left, right)
        if not root:
            return True
        height = getHeight(root, 0)
        if height < 0:
            return False
        else:
            return True
        