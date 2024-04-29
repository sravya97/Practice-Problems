# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        
        def inorder(root, array):
            if root:
                inorder(root.left, array)
                array.append(root.val)
                inorder(root.right, array)
            return array
        
        array = inorder(root, [])
        return array
        
        