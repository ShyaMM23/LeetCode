class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int l= 0, r= nums.length- 1;
        int p= nums.length - 1;

        while (l<=r) {
            int ls=nums[l] * nums[l];
            int rs=nums[r] * nums[r];
            if (ls>rs) {
                ans[p--]=ls;
                l++;
            } else {
                ans[p--]=rs;
                r--;
            }
        }
        return ans;
    }
}
