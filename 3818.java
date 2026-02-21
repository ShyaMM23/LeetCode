class Solution {
    public int minimumPrefixLength(int[] nums) {
        int c=1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){c++;}
            else{break;}
        }
        return nums.length-c;
    }
}
