class Solution {
    public boolean isTrionic(int[] nums) {
        int i=1;
        boolean f1=false,f2=false;
        while(i<nums.length && nums[i]>nums[i-1]){
            f1 = true;
            i++;
        }
        while(i<nums.length && nums[i]<nums[i-1])
        {
            i++;
        }
        while(i<nums.length && nums[i]>nums[i-1])
        {
            f2=true;
            i++;
        }
        return (f1 && f2 && i==nums.length);

    }
}
