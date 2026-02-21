class Solution {
    public int pivotInteger(int n) {
        int val=0;
        int sum=(n*(n+1))/2;
        int x= (int) Math.sqrt(sum);
        return x*x==sum?x:-1;

        
    }
}
