class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> l=new ArrayList<>();
        int r=heights.length;
        int c=heights[0].length;
        boolean[][] pv=new boolean[r][c];
        boolean[][] av=new boolean[r][c];
        Queue<int[]> q=new LinkedList<>();
        Queue<int[]> q1=new LinkedList<>();
         int[] dr={-1,1,0,0};
         int[] dc={0,0,-1,1};
        for(int j=0;j<c;j++){
            q.add(new int[]{0,j});
            pv[0][j]=true;
            q1.add(new int[]{r-1,j});
            av[r-1][j]=true;
        }
        for(int i=0;i<r;i++){
            q.add(new int[]{i,0});
            pv[i][0]=true;
            q1.add(new int[]{i,c-1});
            av[i][c-1]=true;
        }
        while(!q.isEmpty()){
           int[] node=q.poll();
           int e=node[0];
           int f=node[1];
           for(int k=0;k<4;k++){
            int nr=e+dr[k];
            int nc=f+dc[k];
            if(nr>=0 && nc>=0 && nr<r && nc<c && !pv[nr][nc] && heights[nr][nc]>=heights[e][f]){
                q.add(new int[]{nr,nc});
                pv[nr][nc]=true;
            }
           }
        }
        while(!q1.isEmpty()){
           int[] node=q1.poll();
           int e=node[0];
           int f=node[1];
           for(int k=0;k<4;k++){
            int nr=e+dr[k];
            int nc=f+dc[k];
            if(nr>=0 && nc>=0 && nr<r && nc<c && !av[nr][nc] && heights[nr][nc]>=heights[e][f]){
                q1.add(new int[]{nr,nc});
                av[nr][nc]=true;
            }
           }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(pv[i][j] && av[i][j])l.add(Arrays.asList(i,j));
            }
        }
        return l;
    }
}