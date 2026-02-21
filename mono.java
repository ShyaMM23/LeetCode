class Solution {
    public int countMonobit(int n) {
        if(n==0){return 1;}
        int c=2;
        for(int i=2;i<=n;i++){
            if((i&(i+1))==0){
                c++;
            }
        }
        return c;
    }
}
