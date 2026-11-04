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
    int prev=-1;
    int min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root==null)return 0;
        hi(root);
        return min;
    }
    public void hi(TreeNode r1){
        if(r1==null)return ;
        hi(r1.left);
        if(prev!=-1){
        min=Math.min(min,Math.abs(r1.val-prev));}
        prev=r1.val;
        hi(r1.right);

    }
}