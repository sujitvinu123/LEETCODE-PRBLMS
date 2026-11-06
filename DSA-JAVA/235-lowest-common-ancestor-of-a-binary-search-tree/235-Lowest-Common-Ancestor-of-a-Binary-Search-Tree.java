/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        return hi(root,p,q);
    }
    public TreeNode hi(TreeNode r,TreeNode p1,TreeNode q1){
        if(p1.val<r.val && q1.val<r.val)return hi(r.left,p1,q1);
        else if(p1.val>r.val && q1.val>r.val)return hi(r.right,p1,q1);
        else return r;
    }
}