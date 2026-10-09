class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q=new LinkedList<>();
        int r=mat.length;
        int c=mat[0].length;
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){q.add(new int[]{i,j});arr[i][j]=0;}
                else arr[i][j]=-1;
            }
        }
        while(!q.isEmpty()){
            int size=q.size();
            for(int t=0;t<size;t++){
                int[] node=q.poll();
                int e=node[0];
                int f=node[1];
                if(e-1>=0 && arr[e-1][f]==-1){
                    q.add(new int[]{e-1,f});
                    arr[e-1][f]=arr[e][f]+1;
                }
                if(e+1<r && arr[e+1][f]==-1){
                     q.add(new int[]{e+1,f});
                    arr[e+1][f]=arr[e][f]+1;
                }
                if(f-1>=0 && arr[e][f-1]==-1){
                    q.add(new int[]{e,f-1});
                    arr[e][f-1]=arr[e][f]+1;
                }
                if(f+1<c && arr[e][f+1]==-1){
                    q.add(new int[]{e,f+1});
                    arr[e][f+1]=arr[e][f]+1;
                }
            }
        }
        return arr;
    }
}