class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length,col=mat[0].length; 
        if(row*col!=c*r)return mat;
        int[][] re=new int[r][c];
        int l=0,m=0;
        for(int i=0;i<row;i++ ){
            for(int j=0;j<col;j++){
                re[l][m++]=mat[i][j];
                if(m==c){
                    l++;
                    m=0;                  
                }
            }
        }
      return re;  
    }
}
