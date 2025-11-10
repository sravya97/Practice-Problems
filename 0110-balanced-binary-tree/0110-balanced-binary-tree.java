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
        int height = checkBalance(root, 0);
        return height == -1 ? false : true;
    }   

    public int checkBalance(TreeNode node, int height){
        if(node == null){
            return 0;
        } else {
            int left = checkBalance(node.left, height + 1);
            int right = checkBalance(node.right, height - 1);
            if(left == -1 || right == -1){
                return -1;
            }
            if(Math.abs(left - right) <= 1){
                return Math.max(left, right) + 1;
            } else {
                return -1;
            }
        }
    }
}