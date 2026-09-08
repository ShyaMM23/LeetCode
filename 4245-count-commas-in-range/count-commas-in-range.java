class Solution {
    public int countCommas(int n) {
        long a = 0;
        long b = 1000;
        while(b<=n){
            a+=n-b+1;
            b*=1000;
        }
        return (int) a;
    }
}