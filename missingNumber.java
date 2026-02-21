class Solution {
    public int missingNumber(int[] nums) {
        int s2=0,n=nums.length;
        for(int i=0;i<n;i++){
            s2+=nums[i];
        }
        int sum=((n*(n+1))/2);
        return sum-s2;

    }
}
