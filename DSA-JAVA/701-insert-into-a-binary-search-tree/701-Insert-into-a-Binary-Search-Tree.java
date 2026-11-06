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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)return new TreeNode(val);
       
        return  hi(root,val);
    }
    public TreeNode hi(TreeNode r,int v1){
        if(r==null)return new TreeNode(v1);
        if(r.val>v1 )r.left= hi(r.left,v1);
        else r.right= hi(r.right,v1);
        return r;
    }
}