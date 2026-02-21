class Solution {
    public int alternateDigitSum(int n) {
        String n1=String.valueOf(n);
        int sum=0;
        for(int i=0;i<n1.length();i++){
            if(i%2==0)
            {
                sum+=(n1.charAt(i)-'0');
            }
            else{
                sum-=(n1.charAt(i)-'0');
            }
        }
        return sum;
    }
}
