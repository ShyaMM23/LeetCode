class Solution {
    public int numSpecial(int[][] mat) {
        int f=0,c=0;
        int[] rc=new int[mat.length];
        int[] cc=new int[mat[0].length];
        for(int k=0;k<mat.length;k++){
            for(int m=0;m<mat[0].length;m++){
                if(mat[k][m]==1){
                    rc[k]++;
                    cc[m]++;
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && rc[i]==1 && cc[j]==1){
                        c++;
                }
            }
        }
        return c;
    }
}