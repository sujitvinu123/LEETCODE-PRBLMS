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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
        if(p==null || q==null)return false;
        Deque<TreeNode> q1=new LinkedList<>();
        Deque<TreeNode> p1=new LinkedList<>();
        q1.add(p);
        p1.add(q);        
        while(!q1.isEmpty() && !p1.isEmpty()){
            TreeNode c=q1.poll();
            TreeNode c1=p1.poll();
            if(c1!=null && c!=null){
            if(c.val!=c1.val ){
                return false;}}
            if((c.left==null) != (c1.left==null)|| (c.right==null) != (c1.right==null ))return false;
            if(c.left!=null){q1.add(c.left);p1.add(c1.left);}
            if(c1.right!=null){q1.add(c.right);p1.add(c1.right);}
        }
        return true;
    }
}