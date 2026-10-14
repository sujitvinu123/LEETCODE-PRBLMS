class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{sr,sc});
        int r=image.length;
        int c=image[0].length;
        boolean[][] v=new boolean[r][c];
        v[sr][sc]=true;
        int number=image[sr][sc];
        image[sr][sc]=color;
                 while(!q.isEmpty()){
                    int[] node=q.poll();
                    int e=node[0];
                    int f=node[1];
                    if(e-1>=0 && image[e-1][f]==number && !v[e-1][f]){
                        q.add(new int[]{e-1,f});
                        image[e-1][f]=color;
                        v[e-1][f]=true;
                    }
                    if(e+1<r && image[e+1][f]==number && !v[e+1][f]){
                        q.add(new int[]{e+1,f});
                        image[e+1][f]=color;
                        v[e+1][f]=true;
                    }
                    if(f-1>=0 && image[e][f-1]==number && !v[e][f-1]){
                        q.add(new int[]{e,f-1});
                        image[e][f-1]=color;
                        v[e][f-1]=true;
                    }
                    if(f+1<c && image[e][f+1]==number && !v[e][f+1]){
                        q.add(new int[]{e,f+1});
                        image[e][f+1]=color;
                        v[e][f+1]=true;
                    }
                 }
            
        
        return image;

    }
}