/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return depth(root, 0);
    }

    public int depth(TreeNode root, int height){
        if(root == null) {
            return height;
        } else {
            return Math.max(depth(root.left, height + 1), depth(root.right, height + 1));
        }
    } 
}