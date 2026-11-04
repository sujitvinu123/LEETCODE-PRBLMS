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
    int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        sum=0;
        add(root);
        return sum;
    }
    public void add(TreeNode r1){
        if(r1==null)return ;
        if(r1.left!=null && r1.left.left==null && r1.left.right==null){
        sum+=r1.left.val;}
        add(r1.left);
        add(r1.right);
    }
}