class NumMatrix {
    int[][] p;
    public NumMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        p=new int[r+1][c+1];
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                p[i][j]+=matrix[i-1][j-1]+p[i][j-1]+p[i-1][j]-p[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return p[row2+1][col2+1]-p[row2+1][col1]-p[row1][col2+1]+p[row1][col1];
    }
}

