class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr=new int[nums.length];
        int e=0,o=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[e++]=nums[i];
            }
            else{
                arr[o--]=nums[i];
            }
        }
        return arr;
    }
}
