class Solution {
    public int findCircleNum(int[][] isConnected) {
        Queue<Integer> q=new LinkedList<>();
        int r=isConnected.length;
        int c=isConnected[0].length;
        boolean[] v=new boolean[r];
        int count=0;
        for(int i=0;i<r;i++){
            if(!v[i]){
                count++;
                q.add(i);
                v[i]=true;
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int j=0;j<r;j++){
                        if(isConnected[node][j]==1 && !v[j]){
                            q.add(j);
                            v[j]=true;
                        }
                    }
                }
            }
        } 
        return count;
    }
}