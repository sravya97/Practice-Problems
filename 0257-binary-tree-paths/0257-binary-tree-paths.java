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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        backtrack(root, result, "");
        return result;
    }
    
    public void backtrack(TreeNode root, List<String> result, String current){
        if(root.left == null && root.right == null){
            result.add(current + root.val);
            return;
        }
        current += String.valueOf(root.val);
        current += "->";
        if(root.left != null){
            backtrack(root.left, result, current);
        }
        if(root.right != null){
            backtrack(root.right, result, current);
        }
    }
}