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
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int count=0;
        Deque<TreeNode> q=new LinkedList<>();
        q.add(root);
        int d=0;
        while(!q.isEmpty()){
            int s=q.size();
            for(int k=0;k<s;k++){
            TreeNode c=q.poll();
            if(c.left!=null)q.add(c.left);
            if(c.right!=null)q.add(c.right);
            }
            d++;
        }
        return d;
    }
}