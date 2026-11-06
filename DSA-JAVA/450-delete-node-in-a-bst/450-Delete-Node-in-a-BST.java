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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        return hi(root,key);
    }
    public TreeNode hi(TreeNode r,int k1){
        if(r==null)return null;
        if(r.val>k1)r.left=hi(r.left,k1);
        else if(r.val<k1)r.right=hi(r.right,k1);
        else{
            if(r.left==null && r.right==null)return null;
            if(r.left==null)return r.right;
            if(r.right==null)return r.left;
            TreeNode t=r.right;
            while(t.left!=null)t=t.left;
            r.val=t.val;
            r.right=hi(r.right,t.val);
        }
        return r;
    }
}