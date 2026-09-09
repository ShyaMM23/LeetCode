class Solution {
    public long countCommas(long n) {
        if(n<=999) return 0;
        long a=0;
        long start=1000;
        int c=1;
        while(start<=n){
            long i=start*1000-1;
            long c1=Math.min(n,i)-start+1;
            a+=c*c1;
            c++;
            start*=1000;
        }
        return a;
        
    }
}