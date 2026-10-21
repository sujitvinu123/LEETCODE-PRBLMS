class Solution {
    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> q=new LinkedList<>();
        if(root==null)return true;
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
           TreeNode c=q.poll();
           TreeNode c1=q.poll();
           if(c==null && c1==null)continue;
           if(c==null || c1==null)return false;
           if(c.val !=c1.val)return false;
           q.add(c.left);
           q.add(c1.right);
            q.add(c.right);
           q.add(c1.left);

        }
        return true;
    }
}