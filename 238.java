class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1,l=1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=p;
            p*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            arr[i]*=l;
            l*=nums[i];
        }
        return arr;
    }
}
