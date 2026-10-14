class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        Deque<int[]> q=new LinkedList<>();
        int max=0;
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] v=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int count=0;
                if(grid[i][j]==1 && !v[i][j]){q.add(new int[]{i,j});v[i][j]=true;}
            while(!q.isEmpty()){
                int[] node=q.poll();
                count++;
                int e=node[0];
                int f=node[1];
                if(e-1>=0 && grid[e-1][f]!=0 && !v[e-1][f]){
                    q.add(new int[]{e-1,f});
                    v[e-1][f]=true;
                    
                }
                if(e+1<r && grid[e+1][f]!=0 && !v[e+1][f]){
                    q.add(new int[]{e+1,f});
                    v[e+1][f]=true;
                   
                }
                if(f-1>=0 && grid[e][f-1]!=0 && !v[e][f-1]){
                    q.add(new int[]{e,f-1});
                    v[e][f-1]=true;
                    
                }
                if(f+1<c && grid[e][f+1]!=0 && !v[e][f+1]){
                    q.add(new int[]{e,f+1});
                    v[e][f+1]=true;
                    
                }
            }max=Math.max(max,count);
            }}
            return max;
            
    }
}