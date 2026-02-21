class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,i=0,k=mat.length-1,z=0;
        while(i<mat.length && z<mat.length && k>=0){
            sum+=mat[i][i];
            i++;
            if(z!=k){
                sum+=mat[z++][k--];
            }
            else{z++;k--;}
        }
        return sum;
    }
}
