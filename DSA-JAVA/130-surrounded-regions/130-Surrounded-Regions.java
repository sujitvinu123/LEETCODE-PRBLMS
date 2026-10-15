class Solution {
    public void solve(char[][] board) {
        Queue<int[]> q=new LinkedList<>();
        int r=board.length;
        int c=board[0].length;
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        boolean[][] v=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O' && (i==0 ||j==0||i==r-1||j==c-1)){q.add(new int[]{i,j});board[i][j]='$';v[i][j]=true;}
                while(!q.isEmpty()){
                    int[] node=q.poll();
                    int e=node[0];
                    int f=node[1];
                    for(int k=0;k<4;k++){
                        int nr=e+dr[k];
                        int nc=f+dc[k];
                        if(nr>=0 && nc>=0 && nr<r && nc<c && board[nr][nc]=='O' && !v[nr][nc]){  
                            board[nr][nc]='$';
                            q.add(new int[]{nr,nc});
                            v[nr][nc]=true;
                        }
                    }
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='$')board[i][j]='O';
                else board[i][j]='X';
            }
        }

    }
}