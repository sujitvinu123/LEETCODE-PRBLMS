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
        List<String> l=new ArrayList<>();
         issb(root,"",l);
        return l;
    }
    public void issb(TreeNode r1,String path,List<String> w){
        if(r1==null)return ;
        path=path.isEmpty()?""+r1.val:path+"->"+r1.val;
        if(r1.left==null && r1.right==null){ w.add(path);return;}
         issb(r1.left,path,w);issb(r1.right,path,w);
    }
}