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
    public boolean isBalanced(TreeNode root) {
       int height = getHeight(root, 0);
       return height == -1 ? false : true;
    }
    
    public int getHeight(TreeNode root, int height){
        if(height == -1){
            return -1;
        }
        if(root != null){
            int left = getHeight(root.left, height+1);
            int right = getHeight(root.right, height+1);
            if(left == -1 || right == -1){
                return -1;
            } else if(Math.abs(left-right) > 1){
                return -1;
            } else {
                return Math.max(left, right);
            }
        } else {
            return height;
        }
    }
}