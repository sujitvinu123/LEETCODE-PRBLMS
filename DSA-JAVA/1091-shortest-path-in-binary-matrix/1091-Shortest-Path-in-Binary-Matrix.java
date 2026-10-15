class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        if(grid[0][0]==1 || grid[r-1][c-1]==1)return -1;
        Queue<int[]> q=new LinkedList<>();
        boolean[][] v=new boolean[r][c];
        q.add(new int[]{0,0});
        v[0][0]=true;
        int count=1;
        int[] dr={-1,1,0,0,-1,1,-1,1};
        int[] dc={0,0,-1,1,-1,1,1,-1};
        while(!q.isEmpty()){
            int s=q.size();
            for(int k=0;k<s;k++){
            int[] node=q.poll();
            int e=node[0];
            int f=node[1];
            if(e==r-1 && f==c-1)return count;
              for(int i=0;i<8;i++){
                int nr=e+dr[i];
                int nc=f+dc[i];
                if(nr>=0 && nr<r && nc>=0 && nc<c && grid[nr][nc]==0 && !v[nr][nc]){
                    q.add(new int[]{nr,nc});
                    v[nr][nc]=true;
                }
              }
                          
            }
            count++;
            
        }
        return -1;
    }
}