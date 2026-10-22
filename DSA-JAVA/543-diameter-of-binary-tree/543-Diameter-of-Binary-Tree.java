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
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return d;
    }
    public int height(TreeNode r1){
        if(r1==null)return 0;
        int l=height(r1.left);
        int r=height(r1.right);
         d=Math.max(d,l+r);
        return 1+Math.max(l,r);
    }
}