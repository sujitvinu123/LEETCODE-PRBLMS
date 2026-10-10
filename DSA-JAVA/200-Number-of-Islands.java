class Solution {
    public int numIslands(char[][] grid) {
        int d=0;
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] v=new boolean[r][c];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && !v[i][j]){q.add(new int[]{i,j});d++;v[i][j]=true;}
            
        
        while(!q.isEmpty()){
            int[] node=q.poll();
            int e=node[0];
            int f=node[1];
                if(e-1>=0 && grid[e-1][f]=='1' && !v[e-1][f] ){
                    q.add(new int[]{e-1,f});v[e-1][f]=true;
                }
                if(e+1<r && grid[e+1][f]=='1' && !v[e+1][f] ){
                    q.add(new int[]{e+1,f});v[e+1][f]=true;
                }
                if(f-1>=0 && grid[e][f-1]=='1' && !v[e][f-1] ){
                    q.add(new int[]{e,f-1}); v[e][f-1]=true;
                }
                if(f+1<c && grid[e][f+1]=='1' && !v[e][f+1]){
                    q.add(new int[]{e,f+1}); v[e][f+1]=true;
                }
            }}}
             return d;
        
    }
}