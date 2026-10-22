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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Deque<TreeNode> q=new LinkedList<>();
        // Deque<Integer> q1=new LinkedList<>();
        // if(root==null)return false;
        // q.add(root);
        // q1.add(root.val);
        // while(!q.isEmpty()){
        //     TreeNode c=q.poll();
        //     int sum=q1.poll();
        //     if(c.left==null && c.right==null &&  sum==targetSum)return true;
        //     if(c.left!=null){
        //     q.add(c.left);q1.add(sum+c.left.val);}
        //     if(c.right!=null){
        //     q.add(c.right);q1.add(sum+c.right.val);}
        // }
        // return false;
        return issb(root,targetSum);
    }
    public boolean issb(TreeNode r1, int ts){
        if(r1==null)return false;
        int r=ts-r1.val;
        if(r1.left==null && r1.right==null)return r1.val==ts;
         
        return issb(r1.left,r)||issb(r1.right,r);
    }
}