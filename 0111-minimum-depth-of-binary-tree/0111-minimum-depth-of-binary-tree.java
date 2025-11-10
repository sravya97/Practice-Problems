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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        } else {
            return depth(root, 1);
        }
    }

    public int depth(TreeNode root, int height){
        if(root.left == null && root.right == null){
            return height; 
        } else if(root.left == null){
            return depth(root.right, height + 1);
        } else if(root.right == null){
            return depth(root.left, height + 1);
        } else {
            return Math.min(depth(root.right, height + 1), depth(root.left, height + 1));
        }
    }
}