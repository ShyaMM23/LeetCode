class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        for (int i=0;i<n;i++)
        {
            int steps=nums[i];
            int t=(i+steps)%n;
            if (t<0){
                t+=n;
            }
            result[i]=nums[t];
        }
        return result;
    }
}
