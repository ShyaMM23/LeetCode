class Solution {
    public int finalElement(int[] nums) {
        if(nums[0]>nums[nums.length-1])
        {
            return nums[0];
        }
        else{
            return nums[nums.length-1];
        }
    }
}
